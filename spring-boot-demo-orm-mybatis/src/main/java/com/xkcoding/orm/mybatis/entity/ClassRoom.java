package com.xkcoding.orm.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author hwx
 * @date 2020/4/14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoom  implements Serializable{
    private Integer id;
    private String room_name;
    private Teacher teacher;
    private List<Student> students;
}
