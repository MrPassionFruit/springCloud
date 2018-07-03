package com.geneshop.authority.service.impl;

import com.geneshop.authority.domain.RolePageRelativeManage;
import com.geneshop.authority.persistence.RolePageRelativeManagePersistence;
import com.geneshop.authority.service.RolePageRelativeManageService;
import com.hsgene.common.util.character.CharactersConstant;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 角色-页面关系管理service
 *
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:07 2018/6/29
 * @Modified By:
 */
@Service
public class RolePageRelativeManageServiceImpl implements RolePageRelativeManageService
{
    @Autowired
    private RolePageRelativeManagePersistence rolePagePersistence;

    /**
     * 增加角色-页面权限
     *
     * @param rolePageRelativeManage
     * @return
     */
    @Override
    public int insert(RolePageRelativeManage rolePageRelativeManage)
    {
        return rolePagePersistence.insert(rolePageRelativeManage);
    }

    /**
     * 更新角色-页面权限
     *
     * @param rolePageRelativeManage
     * @return
     */
    @Override
    public int update(RolePageRelativeManage rolePageRelativeManage)
    {
        return rolePagePersistence.updateByPrimaryKey(rolePageRelativeManage);
    }

    /**
     * 查询角色-页面权限
     *
     * @param rolePageRelativeManage
     * @return
     */
    @Override
    public List<RolePageRelativeManage> select(RolePageRelativeManage rolePageRelativeManage)
    {
        return rolePagePersistence.select(rolePageRelativeManage);
    }

    /**
     * 删除角色-页面权限
     *
     * @param ids
     * @return
     */
    @Override
    public int delete(String ids)
    {
        //包含逗号,说明是批量删除
        if (ids.contains(CharactersConstant.COMMA_EN))
        {
            return rolePagePersistence.deleteBatch(Arrays.asList(StringUtils.split(ids, CharactersConstant.COMMA_EN)));
        }
        return rolePagePersistence.deleteByPrimaryKey(ids);
    }
}
