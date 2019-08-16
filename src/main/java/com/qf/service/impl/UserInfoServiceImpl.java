package com.qf.service.impl;

import com.qf.dao.UserInfoMapper;
import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DELL on 2019/7/29.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Transactional
    public UserInfo loginCheck(UserInfo userInfo) {
        UserInfo userInfo1 = userInfoMapper.loginCheck(userInfo);
        return userInfo1;
    }

    public boolean registereds(UserInfo userInfo){

        int registereds1 = userInfoMapper.registereds(userInfo);
        return registereds1>0;
    }

    public List<UserInfo> getAllUserInfo(SearchUserInfoDTO searchUserInfoDTO) {
        List<UserInfo> allUserInfo = userInfoMapper.getAllUserInfo(searchUserInfoDTO);
        return allUserInfo;
    }

    public boolean removeUserInfo(int userid) {

        int i = userInfoMapper.removeUserInfo(userid);
        return i>0;
    }
    public UserInfo getUserInfoById(int userid){
        UserInfo userInfoById = userInfoMapper.getUserInfoById(userid);
        return userInfoById;
    }
    public boolean editUserInfoById(UserInfo userInfo){
        int i = userInfoMapper.editUserInfoById(userInfo);
        return i>0;
    }

    public List<MenuInfo> userLoginInit(UserInfo userInfo) {
        return this.userInfoMapper.userLoginInit(userInfo);
    }


//    @Transactional(propagation= Propagation.REQUIRED)
//    public boolean deleteUserById(int id) {
//        return userInfoMapper.deleteUserById(id)>0;
//    }
}
