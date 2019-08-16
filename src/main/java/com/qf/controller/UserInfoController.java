package com.qf.controller;

import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController

public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    //请求映射
    @RequestMapping("loginCheck")
    //该方法的返回值(无论类型),都以json字符串返回.
//    @ResponseBody
    //@RequestBody:声明一个对象，凡是请求过来参数的name和这个对象属性名相同的话，框架就进行封装
    //@RequestParam:声明这是一个请求的参数
//    @ResponseBody
    public Object loginCheck(@RequestBody UserInfo userInfo, HttpSession session){
//        System.out.println("123"+userInfo.getUsername()+":"+userInfo.getPassword());
        System.out.println(userInfo);
        UserInfo userInfo1 = userInfoService.loginCheck(userInfo);
        System.out.println(userInfo);
        if(userInfo1!=null){
            session.setAttribute("userInfo",userInfo1);
            //缓存
            List<MenuInfo> menuInfoList = userInfoService.userLoginInit(userInfo);
            session.setAttribute("menuInfoList",menuInfoList);
        }else {
            //登录失败
        }
        return userInfo1 !=null;

//        if(b){
//            System.out.println("登陆成功");
//        }else{
//            System.out.println("登录失败");
//        }

    }
    @RequestMapping("registerUserInfo")
//    @ResponseBody
    public Object registereds(@RequestBody UserInfo userInfo){
        boolean registereds = userInfoService.registereds(userInfo);
        return registereds;
    }
    @RequestMapping(value = "listAllUserInfo",method = RequestMethod.POST)
//    @ResponseBody
    public Object listAllUserInfo(@RequestBody SearchUserInfoDTO searchUserInfoDTO){
        return this.userInfoService.getAllUserInfo(searchUserInfoDTO);
    }
    @RequestMapping("removeUserInfo")
    public Object removeUserInfo(@RequestParam int userid){
        System.out.println("userid"+userid);
        return this.userInfoService.removeUserInfo(userid);
    }
    @RequestMapping("getUserInfoById")
    public Object getUserInfoById(@RequestParam int userid){
        System.out.println("userid="+userid);
        return this.userInfoService.getUserInfoById(userid);
    }
    @RequestMapping("editUserInfoById")
    public boolean editUserInfoById(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        return this.userInfoService.editUserInfoById(userInfo);
    }
    @RequestMapping("initMenuList")
    public Object initMenuList(@RequestBody(required = false) UserInfo userInfo,HttpSession session){
        if(session.getAttribute("menuInfoList")==null){
            if(userInfo!=null){
                return userInfoService.userLoginInit(userInfo);
            }else {
                return null;
            }
        }else{
            return session.getAttribute("menuInfoList");
        }
    }
}
