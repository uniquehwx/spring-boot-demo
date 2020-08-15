package com.xkcoding.orm.mybatis.MapperAndPage.mapper;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkcoding.orm.mybatis.MapperAndPage.SpringBootDemoOrmMybatisMapperPageApplicationTests;
import com.xkcoding.orm.mybatis.MapperAndPage.entity.Order;
import com.xkcoding.orm.mybatis.MapperAndPage.entity.Student;
import com.xkcoding.orm.mybatis.MapperAndPage.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * UserMapper 测试
 * </p>
 *
 * @package: com.xkcoding.orm.mybatis.MapperAndPage.mapper
 * @description: UserMapper 测试
 * @author: yangkai.shen
 * @date: Created in 2018/11/8 14:25
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
public class OrderMapperTest extends SpringBootDemoOrmMybatisMapperPageApplicationTests {

    @Autowired
    private OrderMapper OrderMapper;
    @Resource
    private StudentMapper studentMapper;

    /**
     * 测试通用Mapper - 保存
     */
    @Test
    public void testInsert() {
        Order order1= Order.builder().userId(3l).count(10).productId(1l).money(new BigDecimal(100)).status(1).build();
        OrderMapper.insert(order1);
       // OrderMapper.insertUseGeneratedKeys(order1);
        Assert.assertNotNull(order1.getId());
        log.debug("【测试主键回写#testSave3.getId()】= {}", order1.getId());
    }

    @Test
    public void test1Insert() {
        Student student=new Student();
        student.setId(5);
        student.setName("ershaei");
        student.setClassRoom(2);
        studentMapper.insertUseGeneratedKeys(student);
        // OrderMapper.insertUseGeneratedKeys(order1);
        Assert.assertNotNull(student.getId());
        log.debug("【测试主键回写#testSave3.getId()】= {}", student.getId());
    }
}