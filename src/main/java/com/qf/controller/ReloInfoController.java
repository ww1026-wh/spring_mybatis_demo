package com.qf.controller;

import com.qf.VO.MenuInfoVO;
import com.qf.VO.RoleInfoVO;
import com.qf.dto.UserRoleDTO;
import com.qf.service.MenuInfoService;
import com.qf.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReloInfoController {
    @Autowired
    RoleInfoService roleInfoService;

    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("listRoleInfoByUserId")
    public Object listRoleInfoByUserId(@RequestParam int userid){
        return roleInfoService.listRoleInfoByUserId(userid);
    }
    @RequestMapping("insertUserRole")
    public Object insertUserRole(@RequestBody UserRoleDTO userRoleDTO){
        System.out.println(userRoleDTO);
        return roleInfoService.addUserRole(userRoleDTO);
    }
    @RequestMapping("removeUserRole")
    public Object removeUserRole(@RequestBody UserRoleDTO userRoleDTO){
        System.out.println(userRoleDTO);
        return roleInfoService.removeUserRole(userRoleDTO);
    }
    @RequestMapping("listMenuByRoleId")
    public Object listMenuByRoleId(@RequestParam int roleid){
       return menuInfoService.listMenuByRoleId(roleid);
    }
}
