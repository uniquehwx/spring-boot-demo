package com.xkcoding.orm.mybatis.mapper;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import com.xkcoding.orm.mybatis.SpringBootDemoOrmMybatisApplicationTests;
import com.xkcoding.orm.mybatis.entity.ClassRoom;
import com.xkcoding.orm.mybatis.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * UserMapper 测试类
 * </p>
 *
 * @package: com.xkcoding.orm.mybatis.mapper
 * @description: UserMapper 测试类
 * @author: yangkai.shen
 * @date: Created in 2018/11/8 11:25
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
public class ClassRoomMapperTest extends SpringBootDemoOrmMybatisApplicationTests {
    @Autowired
    private ClassroomMapper ClassroomMapper;

    /**
     * 测试查询所有
     */
    @Test
    public void selectAllUser() {
        List<ClassRoom> classRoom = ClassroomMapper.selectOnebyOne();
        Assert.assertTrue(CollUtil.isNotEmpty(classRoom));
        log.debug("【userList】= {}", classRoom);
    }

    @Test
    public void selectOnebyOne2() {
        List<ClassRoom> classRoom = ClassroomMapper.selectOnebyOne2();
        Assert.assertTrue(CollUtil.isNotEmpty(classRoom));
        log.debug("【userList】= {}", classRoom);
    }

}