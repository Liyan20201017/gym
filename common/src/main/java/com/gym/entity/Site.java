package com.gym.entity;

import lombok.Data;

@Data
public class Site {
    private int site_id;
    private String site_name;
    private String site_equipmentname;
    private int site_state;

    public int getSite_id() {
        return site_id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getSite_equipmentname() {
        return site_equipmentname;
    }

    public void setSite_equipmentname(String site_equipmentname) {
        this.site_equipmentname = site_equipmentname;
    }

    public int getSite_state() {
        return site_state;
    }

    public void setSite_state(int site_state) {
        this.site_state = site_state;
    }
}
