package com.geneshop.authority.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Mapping接口
 * @Author: wangxuefeng@hsgene.com
 * @Description:
 * @Date: Created in 15:19 2018/6/29
 * @Modified By:
 */
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T>
{
}
