package com.gym.SpringBoot.dao;

import com.gym.entity.Course;
import com.gym.entity.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface IStaffDao {
    List<Map> showStaff(String staff_name);
    Map findStaffById(Staff staff);
    int updateStaffById(Staff staff);
    Map findStaffRoleById(Staff staff);
    int confirmSetRole(String role_id,String staff_id);
    int addStaff(Staff staff);
    int addRoleStaff(Integer staffid);
    Staff findStaffByPhone(Staff staff);
    int addleave(@Param("leave_staff_id")int leave_staff_id,@Param("leave_type")String leave_type,@Param("leave_starttime")String leave_starttime,@Param("leave_deadline")String leave_deadline,@Param("leave_reason")String leave_reason);
    List<Map> showStaffLeave();
    List<Map> showStaffLeaveed();
    List<Map> selectStaffLeave(String start, String end);
    int updStaffLeave(String leave_id);
    Map findStaffLeaveById(String staff_id);
    Map ckdCourseByStaffId(@Param("staff_id") String staff_id,@Param("course_time") String course_time);
    int updPersonCenterById(Staff staff);
    Map findStaffByPwd(String staff_pwd,String staff_id);
    int updStaffPwdById(String staff_pwd,String staff_id);
}
