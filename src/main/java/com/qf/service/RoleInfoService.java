package com.qf.service;

import com.qf.VO.RoleInfoVO;
import com.qf.dto.UserRoleDTO;

import java.util.List;

public interface RoleInfoService {
    public List<RoleInfoVO> listRoleInfoByUserId(int userid);
    public boolean addUserRole(UserRoleDTO userRoleDTO);
    public boolean removeUserRole(UserRoleDTO userRoleDTO);
}
