package com.geneshop.authority.persistence;

import com.geneshop.authority.domain.PageManager;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * 页面管理持久层接口
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 14:02 2018/6/29
 * @Modified By:
 */
public interface AuthorityPagePersistence extends BaseMapper<PageManager>
{
    /**
     * 批量添加
     * @param pageManagerList
     * @return
     */
    int insertBatch(@Param("pageManagerList") List<PageManager> pageManagerList);

    /**
     * 批量删除
     * @param ids 批量删除的id
     * @return
     */
    int deleteBatch(@Param("ids") List<String> ids);
}
