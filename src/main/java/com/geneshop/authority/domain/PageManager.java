package com.geneshop.authority.domain;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 页面管理实体类
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:53 2018/6/28
 * @Modified By:
 */
@Table(name = "geneshop_authority_page_manage")
public class PageManager implements Serializable
{
    /**
     * id
     */
    private int id;
    /**
     * 页面级别
     */
    private String  pageLevel;
    /**
     * 页面类型
     */
    private String  pageType;
    /**
     * 父页面id
     */
    private String  parentPageId;
    /**
     * 页面名称(多个页面时候用英文逗号隔开)
     */
    private String  pageName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date  updateTime;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getPageLevel()
    {
        return pageLevel;
    }

    public void setPageLevel(String pageLevel)
    {
        this.pageLevel = pageLevel;
    }

    public String getPageType()
    {
        return pageType;
    }

    public void setPageType(String pageType)
    {
        this.pageType = pageType;
    }

    public String getParentPageId()
    {
        return parentPageId;
    }

    public void setParentPageId(String parentPageId)
    {
        this.parentPageId = parentPageId;
    }

    public String getPageName()
    {
        return pageName;
    }

    public void setPageName(String pageName)
    {
        this.pageName = pageName;
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
        return "PageManager{" + "id=" + id + ", pageLevel='" + pageLevel + '\'' + ", pageType='" + pageType + '\'' +
               ", parentPageId='" + parentPageId + '\'' + ", pageName='" + pageName + '\'' + ", createTime='" +
               createTime + '\'' + ", updateTime='" + updateTime + '\'' + '}';
    }
}
