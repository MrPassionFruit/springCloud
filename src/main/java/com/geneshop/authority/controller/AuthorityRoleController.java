package com.geneshop.authority.controller;

import com.geneshop.authority.domain.RoleManager;
import com.geneshop.authority.service.AuthorityRoleService;
import com.hsgene.common.util.result.ApiResult;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 权限角色管理控制层
 *
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:52 2018/6/28
 * @Modified By:
 */
@RestController
@RequestMapping("/authority/role")
public class AuthorityRoleController
{
    @Autowired
    private AuthorityRoleService authorityService;

    /**
     * 添加角色
     *
     * @param roleManager 添加角色信息对象
     * @return
     */
    @RequestMapping("/addRole")
    public ApiResult addRole(RoleManager roleManager)
    {
        if (roleManager == null)
        {
            return new ApiResult("信息不能为空","error");
        }
        roleManager.setCreateTime(new Date());
        int result = authorityService.addRole(roleManager);
        return new ApiResult(result,"success");
    }

    /**
     * 修改角色
     *
     * @param roleManager 修改角色信息对象
     * @return
     */
    @RequestMapping("/updateRole")
    public ApiResult updateRole(RoleManager roleManager)
    {
        if (roleManager == null)
        {
            return new ApiResult("信息不能为空","error");
        }
        int result = authorityService.updateRole(roleManager);
        return new ApiResult(result,"success");
    }

    /**
     * 查询角色
     *
     * @param roleManager 查询角色信息对象
     * @return
     */
    @RequestMapping("/selectRole")
    public ApiResult selectRole(RoleManager roleManager)
    {
        if (roleManager == null)
        {
            return new ApiResult("信息不能为空","error");
        }
        List<RoleManager> result = authorityService.selectRole(roleManager);
        return new ApiResult(result,"success");
    }

    /**
     * 删除角色
     *
     * @param id 删除角色id
     * @return
     */
    @RequestMapping("/deleteRole")
    public ApiResult deleteRole(String id)
    {
        int result = authorityService.deleteRole(id);
        return new ApiResult(result,"success");
    }
}
