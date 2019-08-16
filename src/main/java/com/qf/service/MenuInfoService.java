package com.qf.service;

import com.qf.VO.MenuInfoVO;
import com.qf.VO.MenuListVO;
import com.qf.dto.ModifyRoleMenuDTO;

import java.util.List;

public interface MenuInfoService {
    public List<MenuInfoVO> listMenuByRoleId(int roleid);

    public boolean updateRoleMenu(ModifyRoleMenuDTO modifyRoleMenuDTO);

    public List<MenuListVO> listAllMenu();
}
