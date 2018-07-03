package com.geneshop.authority.service;

import com.geneshop.authority.domain.RoleManager;

import java.util.List;

/**
 * 权限管理Service接口
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 17:20 2018/6/28
 * @Modified By:
 */
public interface AuthorityRoleService
{
    /**
     * 添加角色
     * @param roleManager 角色对象
     * @return
     */
    int addRole(RoleManager roleManager);

    /**
     * 更新角色
     * @param roleManager  roleManager
     * @return
     */
    int updateRole(RoleManager roleManager);

    /**
     * 查找角色
     * @param roleManager 角色对象
     * @return
     */
    List<RoleManager> selectRole(RoleManager roleManager);

    /**
     * 删除角色
     * @param id id
     * @return
     */
    int deleteRole(String id);
}
