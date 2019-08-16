package com.qf;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
        UserInfoService bean = context.getBean(UserInfoService.class);
//        List<UserInfo> userInfos = bean.listAll();
//        System.out.println(userInfos);
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("ww");
        userInfo.setPassword("11233");
//        boolean b = bean.loginCheck(userInfo);
//        boolean registered1 = bean.registered(userInfo);
//        if(registered1){
//            System.out.println("注册成功");
//        }else{
//            System.out.println("注册失败");
//        }

    }
}
