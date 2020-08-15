package com.xkcoding.orm.mybatis.MapperAndPage.entity;

import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "class_room")
    private Integer classRoom;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return class_room
     */
    public Integer getClassRoom() {
        return classRoom;
    }

    /**
     * @param classRoom
     */
    public void setClassRoom(Integer classRoom) {
        this.classRoom = classRoom;
    }
}