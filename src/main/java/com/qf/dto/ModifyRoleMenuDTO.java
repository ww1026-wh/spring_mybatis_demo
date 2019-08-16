package com.qf.dto;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ModifyRoleMenuDTO {
    int roleid;
    List<Integer> menuIds;

}
