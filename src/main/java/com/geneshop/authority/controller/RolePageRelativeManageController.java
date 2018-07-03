package com.geneshop.authority.controller;

import com.geneshop.authority.domain.RolePageRelativeManage;
import com.geneshop.authority.service.RolePageRelativeManageService;
import com.hsgene.common.util.result.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * 角色-页面权限管理控制器
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:05 2018/6/29
 * @Modified By:
 */
@RestController
@RequestMapping("/authority/rolePageRelative")
public class RolePageRelativeManageController
{
    @Autowired
    private RolePageRelativeManageService rolePageRelativeService;

    /**
     * 添加角色-页面权限
     * @param rolePageRelativeManage 角色-页面权限信息对象
     * @return
     */
    @RequestMapping("/addRolePageRelative")
    public Object addPage(RolePageRelativeManage rolePageRelativeManage)
    {
        int result = rolePageRelativeService.insert(rolePageRelativeManage);
        return new ApiResult(result, "success");
    }

    /**
     * 更新角色-页面权限
     *
     * @param rolePageRelativeManage 角色-页面权限信息对象
     * @return
     */
    @RequestMapping("/updateRolePageRelative")
    public ApiResult updatePage(RolePageRelativeManage rolePageRelativeManage)
    {
        if (rolePageRelativeManage == null)
        {
            return new ApiResult("信息不能为空", "error");
        }
        int result = rolePageRelativeService.update(rolePageRelativeManage);
        return new ApiResult(result, "success");
    }

    /**
     * 查询角色-页面权限
     *
     * @param rolePageRelativeManage 角色-页面权限信息对象
     * @return
     */
    @RequestMapping("/selectRolePageRelative")
    public ApiResult selectPage(RolePageRelativeManage rolePageRelativeManage)
    {
        if (rolePageRelativeManage == null)
        {
            return new ApiResult("信息不能为空", "error");
        }
        List<RolePageRelativeManage> result = rolePageRelativeService.select(rolePageRelativeManage);
        return new ApiResult(result, "success");
    }

    /**
     * 删除角色-页面权限
     *
     * @param id 关系id
     * @return
     */
    @RequestMapping("/deleteRolePageRelative")
    public ApiResult deletePage(String id)
    {
        int result = rolePageRelativeService.delete(id);
        return new ApiResult(result, "success");
    }
}
