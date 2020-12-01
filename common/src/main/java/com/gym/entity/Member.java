package com.gym.entity;

import lombok.Data;

@Data
public class Member {
    private int member_id;
    private String member_name;
    private String member_price;
    private int member_count;
    private int member_state;

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_price() {
        return member_price;
    }

    public void setMember_price(String member_price) {
        this.member_price = member_price;
    }

    public int getMember_count() {
        return member_count;
    }

    public void setMember_count(int member_count) {
        this.member_count = member_count;
    }

    public int getMember_state() {
        return member_state;
    }

    public void setMember_state(int member_state) {
        this.member_state = member_state;
    }
}
