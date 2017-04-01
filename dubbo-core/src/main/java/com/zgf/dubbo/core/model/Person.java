package com.zgf.dubbo.core.model;

import java.io.Serializable;

/**
 * Created by zgf on 17/3/31.
 */

public class Person implements Serializable {


    private String id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
