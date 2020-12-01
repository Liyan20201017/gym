package com.gym.springBootGateWay.util;

import com.gym.entity.Staff;

public class ReturnInfo {
    private int code;

    private Staff staff;

    public ReturnInfo(int code, Staff staff) {
        this.code = code;
        this.staff = staff;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
