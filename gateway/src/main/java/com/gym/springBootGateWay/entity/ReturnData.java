package com.gym.springBootGateWay.entity;

import com.gym.entity.Menu;
import com.gym.entity.Staff;

import java.util.List;
import java.util.Map;

//保存token登录信息
public class ReturnData<T> {

    private int code;

    private String mass;

    private T data;

    private Map staff;

    private List<Menu> menuList;

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Map getStaff() {
        return staff;
    }

    public void setStaff(Map map) {
        this.staff = staff;
    }

    public ReturnData(int code, String mass, T data, Map staff,List<Menu> menuList) {
        this.code = code;
        this.mass = mass;
        this.data = data;
        this.staff = staff;
        this.menuList=menuList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}