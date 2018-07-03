package com.geneshop.authority.domain;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色-页面关系实体类
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:43 2018/6/29
 * @Modified By:
 */
@Table(name = "geneshop_authority_role_page_relative")
public class RolePageRelativeManage implements Serializable
{
    /**
     * id
     */
    private int id;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 页面id,可多个,英文逗号隔开
     */
    private String pageId;

    /**
     * 权限
     */
    private String currentAuthority;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getRoleId()
    {
        return roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    public String getPageId()
    {
        return pageId;
    }

    public void setPageId(String pageId)
    {
        this.pageId = pageId;
    }

    public String getCurrentAuthority()
    {
        return currentAuthority;
    }

    public void setCurrentAuthority(String currentAuthority)
    {
        this.currentAuthority = currentAuthority;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    @Override
    public String toString()
    {
        return "RolePageRelativeManage{" + "id=" + id + ", roleId='" + roleId + '\'' + ", pageId='" + pageId + '\'' +
               ", currentAuthority=" + currentAuthority + ", createTime='" + createTime + '\'' + ", updateTime='" +
               updateTime + '\'' + '}';
    }
}
