package com.gym.SpringBoot.service;

import com.gym.entity.Staff;

import java.util.List;
import java.util.Map;

public interface IStaffService {
    List<Map> showStaff(String staff_name);
    Map findStaffById(Staff staff);
    int updateStaffById(Staff staff);
    Map findStaffRoleById(Staff staff);
    int confirmSetRole(String role_id,String staff_id);
    int addStaff(Staff staff);
    Staff findStaffByPhone(Staff staff);
    int addleave(String leave_staff_id,String leave_type,String leave_starttime,String leave_deadline,String leave_reason);
    List<Map> showStaffLeave();
    int updStaffLeave(String leave_id);
    Map findStaffLeaveById(String staff_id);
    Map ckdCourseByStaffId(String staff_id, String course_time);
    int updPersonCenterById(Staff staff);
    Map findStaffByPwd(String staff_pwd,String staff_id);
    int updStaffPwdById(String staff_pwd,String staff_id);

    List<Map> showStaffLeaveed();

    List<Map> selectStaffLeave(String start, String end);
}
