package com.qf.dao;

import com.qf.VO.RoleInfoVO;
import com.qf.dto.UserRoleDTO;
import com.qf.pojo.RoleInfo;

import java.util.List;

/**
 * Created by DELL on 2019/7/24.
 */
public interface RoleInfoMapper {
    public RoleInfo selectRoleInfoById(int id);
    public List<RoleInfoVO> listRoleInfoByUserId(int userid);
    public int addUserRole(UserRoleDTO userRoleDTO);
    public int removeUserRole(UserRoleDTO userRoleDTO);
}
