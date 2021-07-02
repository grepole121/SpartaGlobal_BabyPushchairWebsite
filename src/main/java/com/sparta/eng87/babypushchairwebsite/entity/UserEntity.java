package com.sparta.eng87.babypushchairwebsite.entity;

import javax.persistence.*;


@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private Integer userId;

    private String userName;
    private String userPassword;
    private String userRole;
    private Integer userActivated;

    public UserEntity(String userName, String userPassword, String userRole, Integer userActivated) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.userActivated = userActivated;
    }

    public UserEntity() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Integer getUserActivated() {
        return userActivated;
    }

    public void setUserActivated(Integer userActivated) {
        this.userActivated = userActivated;
    }
}
