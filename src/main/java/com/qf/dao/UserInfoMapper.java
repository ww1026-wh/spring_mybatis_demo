package com.qf.dao;

import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;

import java.util.List;

/**
 * Created by DELL on 2019/7/24.
 */
public interface UserInfoMapper {

   public UserInfo loginCheck(UserInfo userInfo);
   public List<UserInfo> registered(UserInfo userInfo);
   public int registereds(UserInfo userInfo);
   public List<UserInfo> getAllUserInfo(SearchUserInfoDTO searchUserInfoDTO);
   public int removeUserInfo(int userid);
   public UserInfo getUserInfoById(int userid);
   public int editUserInfoById(UserInfo userInfo);
   public List<MenuInfo> userLoginInit(UserInfo userInfo);
}
