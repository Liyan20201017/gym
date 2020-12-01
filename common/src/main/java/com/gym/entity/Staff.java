package com.gym.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Staff {
    private int staff_id;
    private String staff_name;
    private String staff_pwd;
    private int staff_sex;
    private int staff_age;
    private String staff_phone;
    private String staff_address;

    public String getStaff_entrytime() {
        return staff_entrytime;
    }

    public void setStaff_entrytime(String staff_entrytime) {
        this.staff_entrytime = staff_entrytime;
    }

    private String staff_entrytime;
    private int staff_state;

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_pwd() {
        return staff_pwd;
    }

    public void setStaff_pwd(String staff_pwd) {
        this.staff_pwd = staff_pwd;
    }

    public int getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(int staff_sex) {
        this.staff_sex = staff_sex;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public void setStaff_address(String staff_address) {
        this.staff_address = staff_address;
    }


    public int getStaff_state() {
        return staff_state;
    }

    public void setStaff_state(int staff_state) {
        this.staff_state = staff_state;
    }
}
