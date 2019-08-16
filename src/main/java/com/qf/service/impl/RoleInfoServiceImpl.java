package com.qf.service.impl;

import com.qf.VO.RoleInfoVO;
import com.qf.dao.RoleInfoMapper;
import com.qf.dto.UserRoleDTO;
import com.qf.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<RoleInfoVO> listRoleInfoByUserId(int userid) {
        List<RoleInfoVO> roleInfoVOS = roleInfoMapper.listRoleInfoByUserId(userid);
        return roleInfoVOS;
    }
    @Transactional
    public boolean addUserRole(UserRoleDTO userRoleDTO) {
        int i = roleInfoMapper.addUserRole(userRoleDTO);
        return i>0;
    }
    @Transactional
    public boolean removeUserRole(UserRoleDTO userRoleDTO) {
        int i = roleInfoMapper.removeUserRole(userRoleDTO);
        return i>0;
    }
}
