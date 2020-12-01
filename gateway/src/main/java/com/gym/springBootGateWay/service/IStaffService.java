package com.gym.springBootGateWay.service;

import com.gym.entity.Menu;
import com.gym.entity.Staff;

import java.util.List;
import java.util.Map;

public interface IStaffService {
    Map showStaff(Staff staff);
    Staff showStaffPhone(Staff staff);
    List<Menu> findStaffByMenu(Staff staff);

    int updStaffLeave(String leave_id);

    int updCourseState(String staff_id,String leave_time,String leave_deadline);

    int ckdAndUpdStaffState();

    int updateStaffLeaveById(String staff_id);

    int updStaffLeaveFail(String leave_id,String staff_id);
}
