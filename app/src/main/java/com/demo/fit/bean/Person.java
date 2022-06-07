package com.demo.fit.bean;


import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class Person extends LitePalSupport {
    @Column(unique = true, defaultValue = "unknown")
    private String name;
    private String password;
    private String age;
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}


