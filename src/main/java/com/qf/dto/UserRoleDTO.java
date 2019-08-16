package com.qf.dto;

public class UserRoleDTO {
    int roleid;
    int userid;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "UserRoleDTO{" +
                "roleid=" + roleid +
                ", userid=" + userid +
                '}';
    }
}
