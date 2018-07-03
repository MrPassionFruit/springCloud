package com.geneshop.authority.persistence;

import com.geneshop.authority.domain.RoleManager;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;
import java.util.stream.BaseStream;

/**
 * 权限管理数据持久层接口
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 17:21 2018/6/28
 * @Modified By:
 */
public interface AuthorityRolePersistence extends BaseMapper<RoleManager>
{
    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteBatch(@Param("ids") List<String> ids);
}
