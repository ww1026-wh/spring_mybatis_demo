package com.qf.dao;

import com.qf.VO.MenuInfoVO;
import com.qf.VO.MenuListVO;
import com.qf.dto.ModifyRoleMenuDTO;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.RoleMenuInfo;

import java.util.List;

/**
 * Created by DELL on 2019/7/24.
 */
public interface MenuInfoMapper {

    public List<MenuInfo> listParentMenu();

    public List<MenuInfoVO> listMenuByRoleId(int roleid);

    public int removeRoleMenuByMenuId(ModifyRoleMenuDTO modifyRoleMenuDTO);

    public List<RoleMenuInfo> listRoleMenuByRoleId(ModifyRoleMenuDTO modifyRoleMenuDTO);

    public int addRoleMenuByRoleId(ModifyRoleMenuDTO modifyRoleMenuDTO);

    public List<MenuListVO> listAllMenu();
}
