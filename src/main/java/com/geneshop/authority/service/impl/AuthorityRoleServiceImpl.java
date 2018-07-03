package com.geneshop.authority.service.impl;

import com.geneshop.authority.domain.RoleManager;
import com.geneshop.authority.persistence.AuthorityRolePersistence;
import com.geneshop.authority.service.AuthorityRoleService;
import com.hsgene.common.util.character.CharactersConstant;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 权限管理业务层
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 17:21 2018/6/28
 * @Modified By:
 */
@Service
public class AuthorityRoleServiceImpl implements AuthorityRoleService
{
    @Autowired
    private AuthorityRolePersistence authorityPersistence;

    @Override
    public int addRole(RoleManager roleManager)
    {
        return authorityPersistence.insert(roleManager);
    }

    @Override
    public int updateRole(RoleManager roleManager)
    {
        return authorityPersistence.updateByPrimaryKey(roleManager);
    }

    @Override
    public List<RoleManager> selectRole(RoleManager roleManager)
    {
        return authorityPersistence.select(roleManager);
    }

    @Override
    public int deleteRole(String id)
    {
        //包含逗号,说明是批量删除
        if (id.contains(CharactersConstant.COMMA_EN))
        {
            return authorityPersistence.deleteBatch(Arrays.asList(StringUtils.split(id, CharactersConstant.COMMA_EN)));
        }
        return authorityPersistence.deleteByPrimaryKey(id);
    }
}
