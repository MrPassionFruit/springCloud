package com.geneshop.authority.domain;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色管理实体类
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:53 2018/6/28
 * @Modified By:
 */
@Table(name = "geneshop_authority_role_manage")
public class RoleManager implements Serializable
{
    /**
     * id
     */
    private int id;
    /**
     * 角色类型
     */
    private String roleName;
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

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
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
        return "RoleManager{" + "id=" + id + ", roleName='" + roleName + '\'' + ", createTime='" + createTime + '\'' +
               ", updateTime='" + updateTime + '\'' + '}';
    }
}
