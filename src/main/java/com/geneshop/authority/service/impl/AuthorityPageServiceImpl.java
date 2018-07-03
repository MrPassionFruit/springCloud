package com.geneshop.authority.service.impl;

import com.geneshop.authority.domain.PageManager;
import com.geneshop.authority.persistence.AuthorityPagePersistence;
import com.geneshop.authority.service.AuthorityPageService;
import com.hsgene.common.util.character.CharactersConstant;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 页面业务层
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 14:02 2018/6/29
 * @Modified By:
 */
@Service
public class AuthorityPageServiceImpl implements AuthorityPageService
{
    @Autowired
    private AuthorityPagePersistence pagePersistence;

    /**
     * 添加页面
     *
     * @param pageManager 页面信息对象
     * @return
     */
    @Override
    public int insert(PageManager pageManager)
    {
        return pagePersistence.insert(pageManager);
    }

    @Override
    public int update(PageManager pageManager)
    {
        return pagePersistence.updateByPrimaryKey(pageManager);
    }

    @Override
    public List<PageManager> select(PageManager pageManager)
    {
        return pagePersistence.select(pageManager);
    }

    @Override
    public int delete(String id)
    {
        //包含逗号,说明是批量删除
        if (id.contains(CharactersConstant.COMMA_EN))
        {
            return pagePersistence.deleteBatch(Arrays.asList(StringUtils.split(id,CharactersConstant.COMMA_EN)));
        }
        return pagePersistence.deleteByPrimaryKey(id);
    }

    /**
     * 批量添加
     *
     * @param pageManagerList
     * @return
     */
    @Override
    public int insertList(List<PageManager> pageManagerList)
    {
        return pagePersistence.insertBatch(pageManagerList);
    }
}
