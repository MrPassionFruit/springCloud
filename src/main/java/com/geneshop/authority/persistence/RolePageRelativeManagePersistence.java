package com.geneshop.authority.persistence;

import com.geneshop.authority.domain.RolePageRelativeManage;
import com.geneshop.authority.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色-页面关系管理mapper接口
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 16:07 2018/6/29
 * @Modified By:
 */
public interface RolePageRelativeManagePersistence extends BaseMapper<RolePageRelativeManage>
{
    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteBatch(@Param("ids") List<String> ids);
}
