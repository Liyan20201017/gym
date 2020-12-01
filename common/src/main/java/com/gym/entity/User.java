package com.gym.entity;


import lombok.Data;

@Data
public class User {
    private Integer user_id;
    private String user_name;
    private String user_phone;
    private Integer user_state;
    private String user_starttime;
    private String user_finshtime;
    private Integer user_member_id;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public Integer getUser_state() {
        return user_state;
    }

    public void setUser_state(Integer user_state) {
        this.user_state = user_state;
    }

    public String getUser_starttime() {
        return user_starttime;
    }

    public void setUser_starttime(String user_starttime) {
        this.user_starttime = user_starttime;
    }

    public String getUser_finshtime() {
        return user_finshtime;
    }

    public void setUser_finshtime(String user_finshtime) {
        this.user_finshtime = user_finshtime;
    }

    public Integer getUser_member_id() {
        return user_member_id;
    }

    public void setUser_member_id(Integer user_member_id) {
        this.user_member_id = user_member_id;
    }
}
