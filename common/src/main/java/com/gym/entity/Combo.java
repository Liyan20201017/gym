package com.gym.entity;

import lombok.Data;

@Data
public class Combo {
    private int combo_id;
    private String combo_name;
    private String combo_staff_id;
    private String combo_price;
    private String combo_count;
    private String combo_details;

    public int getCombo_id() {
        return combo_id;
    }

    public void setCombo_id(int combo_id) {
        this.combo_id = combo_id;
    }

    public String getCombo_name() {
        return combo_name;
    }

    public void setCombo_name(String combo_name) {
        this.combo_name = combo_name;
    }

    public String getCombo_staff_id() {
        return combo_staff_id;
    }

    public void setCombo_staff_id(String combo_staff_id) {
        this.combo_staff_id = combo_staff_id;
    }

    public String getCombo_price() {
        return combo_price;
    }

    public void setCombo_price(String combo_price) {
        this.combo_price = combo_price;
    }

    public String getCombo_count() {
        return combo_count;
    }

    public void setCombo_count(String combo_count) {
        this.combo_count = combo_count;
    }

    public String getCombo_details() {
        return combo_details;
    }

    public void setCombo_details(String combo_details) {
        this.combo_details = combo_details;
    }
}
