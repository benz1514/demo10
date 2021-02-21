package com.example.demo.controller;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
 public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String s61123831;
    private Date Birthdate;
    private Integer Age;

    public UserEntity() {
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.Birthdate = birthdate;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        this.Age = age;
    }

    public Date getBrithdate() {
        return Birthdate;
    }

    public void setBrithdate(Date brithdate) {
        this.Birthdate = brithdate;
    }

    public String getS61123831() {
        return s61123831;
    }

    public void setS61123831(String s61123831) {
        this.s61123831 = s61123831;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
