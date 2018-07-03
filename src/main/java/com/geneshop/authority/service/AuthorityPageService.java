package com.geneshop.authority.service;

import com.geneshop.authority.domain.PageManager;

import java.util.List;

/**
 * 页面服务接口
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 14:02 2018/6/29
 * @Modified By:
 */
public interface AuthorityPageService
{
    /**
     * 插入页面
     * @param pageManager 页面信息对象
     * @return
     */
    int insert(PageManager pageManager);

    /**
     * 更新页面
     * @param pageManager 页面信息对象
     * @return
     */
    int update(PageManager pageManager);

    /**
     * 查询页面
     * @param pageManager 页面信息对象
     * @return
     */
    List<PageManager> select(PageManager pageManager);

    /**
     * 删除页面
     * @param id 页面id
     * @return
     */
    int delete(String id);

    /**
     * 批量添加
     * @param pageManagerList
     * @return
     */
    int insertList(List<PageManager> pageManagerList);
}
