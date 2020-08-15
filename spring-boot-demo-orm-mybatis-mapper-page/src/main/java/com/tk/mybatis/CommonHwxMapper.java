package com.tk.mybatis;

import com.xkcoding.orm.mybatis.MapperAndPage.entity.Order;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author hwx
 * @date 2020/5/22
 */


public interface CommonHwxMapper<T>  extends Mapper<T>, MySqlMapper<T> {
}
