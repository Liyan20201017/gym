package com.gym.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Menu {
    private int menu_id;
    private String menu_name;
    private int menu_pid;
    private String menu_path;
    private String menu_component;
    private String menu_icon;
    private List<Menu> menuList=new ArrayList<>();

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public int getMenu_pid() {
        return menu_pid;
    }

    public void setMenu_pid(int menu_pid) {
        this.menu_pid = menu_pid;
    }

    public String getMenu_path() {
        return menu_path;
    }

    public void setMenu_path(String menu_path) {
        this.menu_path = menu_path;
    }

    public String getMenu_component() {
        return menu_component;
    }

    public void setMenu_component(String menu_component) {
        this.menu_component = menu_component;
    }

    public String getMenu_icon() {
        return menu_icon;
    }

    public void setMenu_icon(String menu_icon) {
        this.menu_icon = menu_icon;
    }
}
