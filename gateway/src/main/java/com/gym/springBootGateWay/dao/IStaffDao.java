package com.gym.springBootGateWay.dao;

import com.gym.entity.Menu;
import com.gym.entity.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IStaffDao {
    Map showStaff(Staff staff);
    Staff showStaffPhone(Staff staff);
    List<Menu> findStaffByMenu(Staff staff);
    int updStaffLeave(String leave_id);
    int updCourseState(@Param("staff_id")String staff_id,@Param("leave_time") String leave_time,@Param("leave_deadline") String leave_deadline);
    int ckdAndUpdStaffState();
    int updateStaffLeaveById(String staff_id);
    int updStaffLeaveFail(String leave_id);

    int updateStaffLeaveFailById(@Param("staff_id")String staff_id);
}
