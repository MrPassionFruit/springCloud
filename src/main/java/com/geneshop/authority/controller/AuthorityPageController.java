package com.geneshop.authority.controller;

import com.geneshop.authority.domain.PageManager;
import com.geneshop.authority.service.AuthorityPageService;
import com.hsgene.common.util.character.CharactersConstant;
import com.hsgene.common.util.result.ApiResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 权限页面管理
 *
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 14:01 2018/6/29
 * @Modified By:
 */
@RestController
@RequestMapping("/authority/page")
public class AuthorityPageController
{
    @Autowired
    private AuthorityPageService authorityPageService;

    /**
     * 添加页面
     * @param pageManager 页面信息对象
     * @return
     */
    @RequestMapping("/addPage")
    public Object addPage(PageManager pageManager)
    {
        int result = 0;
        //校验是否是多个页面
        String pageName = pageManager.getPageName();
        if (StringUtils.isNotEmpty(pageName) && pageName.contains(CharactersConstant.COMMA_EN))
        {
            //多个页面封装对象
            List<PageManager> pageManagerList = getAddPageLists(pageManager, pageName);
            result = authorityPageService.insertList(pageManagerList);
            return new ApiResult(result, "success");
        }
        result = authorityPageService.insert(pageManager);
        return new ApiResult(result, "success");
    }

    private List<PageManager> getAddPageLists(PageManager pageManager, String pageName)
    {
        List<PageManager> pageManagerList = new ArrayList<>();
        //批量添加
        String[] pageNames = StringUtils.split(pageName, CharactersConstant.COMMA_EN);
        for (String pn : pageNames)
        {
            PageManager pm = new PageManager();
            BeanUtils.copyProperties(pageManager, pm);
            pm.setPageName(pn);
            pageManagerList.add(pm);
        }
        return pageManagerList;
    }

    /**
     * 更新页面
     *
     * @param pageManager 页面信息对象
     * @return
     */
    @RequestMapping("/updatePage")
    public ApiResult updatePage(PageManager pageManager)
    {
        if (pageManager == null)
        {
            return new ApiResult("信息不能为空", "error");
        }
        int result = authorityPageService.update(pageManager);
        return new ApiResult(result, "success");
    }

    /**
     * 查询页面
     *
     * @param pageManager 页面信息对象
     * @return
     */
    @RequestMapping("/selectPage")
    public ApiResult selectPage(PageManager pageManager)
    {
        if (pageManager == null)
        {
            return new ApiResult("信息不能为空", "error");
        }
        List<PageManager> result = authorityPageService.select(pageManager);
        return new ApiResult(result, "success");
    }

    /**
     * 删除页面
     *
     * @param id 页面id
     * @return
     */
    @RequestMapping("/deletePage")
    public ApiResult deletePage(String id)
    {
        int result = authorityPageService.delete(id);
        return new ApiResult(result, "success");
    }
}
