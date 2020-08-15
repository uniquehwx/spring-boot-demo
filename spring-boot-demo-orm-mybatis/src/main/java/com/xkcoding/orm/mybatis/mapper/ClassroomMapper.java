package com.xkcoding.orm.mybatis.mapper;

import com.xkcoding.orm.mybatis.entity.ClassRoom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hwx
 * @date 2020/4/14
 */
@Component
@Mapper
public interface ClassroomMapper {

    //第一种方式
    List<ClassRoom> selectOnebyOne();
    //第二种方式
    List<ClassRoom> selectOnebyOne2();
}
