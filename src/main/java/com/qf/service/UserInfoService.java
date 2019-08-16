package com.qf.service;

import com.qf.dto.SearchUserInfoDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;

import java.util.List;

/**
 * Created by DELL on 2019/7/29.
 */
public interface UserInfoService {
    /**
     * 获取所有用户信息
     */
    public UserInfo loginCheck(UserInfo userInfo);
    public boolean registereds(UserInfo userInfo);
    public List<UserInfo> getAllUserInfo(SearchUserInfoDTO searchUserInfoDTO);
    public boolean removeUserInfo(int userid);
    public UserInfo getUserInfoById(int userid);
    public boolean editUserInfoById(UserInfo userInfo);
    public List<MenuInfo> userLoginInit(UserInfo userInfo);
    /**
     * 执行UserInfo表的删除操作并根据返回值判定结果
     * @param id 要删除的用户id
     * @return 是否删除成功
     */
//    public boolean deleteUserById(int id);
}
