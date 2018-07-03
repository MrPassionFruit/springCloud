package com.geneshop.authority.service;

import com.geneshop.authority.domain.RolePageRelativeManage;

import java.util.List;

/**
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:07 2018/6/29
 * @Modified By:
 */
public interface RolePageRelativeManageService
{
    /**
     * 添加角色-页面权限
     * @param rolePageRelativeManage
     * @return
     */
    int insert(RolePageRelativeManage rolePageRelativeManage);

    /**
     * 更新角色-页面权限
     * @param rolePageRelativeManage
     * @return
     */
    int update(RolePageRelativeManage rolePageRelativeManage);

    /**
     * 查询角色-页面权限
     * @param rolePageRelativeManage
     * @return
     */
    List<RolePageRelativeManage> select(RolePageRelativeManage rolePageRelativeManage);

    /**
     * 删除角色-页面权限
     * @param id
     * @return
     */
    int delete(String id);
}
