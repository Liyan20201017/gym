package com.ly.SpringBoot.service;

import com.gym.entity.Staff;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.Map;

@FeignClient("product")
public interface OrderStaffService {

    @GetMapping("showStaff")
    List<Map> showStaff(@RequestParam("staff_name")String staff_name);

    @GetMapping("findStaffById")
    Map findStaffById(@RequestParam("staff_id") String staff_id);

    @GetMapping("updateStaffById")
    int updateStaffById(@RequestParam("staff_id") Integer staff_id,@RequestParam("staff_name") String staff_name, @RequestParam("staff_age") Integer staff_age, @RequestParam("staff_address") String staff_address, @RequestParam("staff_sex") Integer staff_sex, @RequestParam("staff_state") Integer staff_state, @RequestParam("staff_entrytime") String staff_entrytime,@RequestParam("staff_phone") String staff_phone);

    @GetMapping("findStaffRoleById")
    Map findStaffRoleById(@RequestParam("staff_id") Integer staff_id);

    @GetMapping("confirmSetRole")
    int confirmSetRole(@RequestParam("role_id") String role_id,@RequestParam("staff_id") String staff_id);

    @GetMapping("addStaff")
    int addStaff(@RequestParam("staff_name") String staff_name, @RequestParam("staff_age") Integer staff_age, @RequestParam("staff_address") String staff_address, @RequestParam("staff_sex") Integer staff_sex, @RequestParam("staff_entrytime") String staff_entrytime,@RequestParam("staff_phone") String staff_phone);

    @GetMapping("findStaffByPhone")
    Staff findStaffByPhone(@RequestParam("staff_phone") String staff_phone);

    @GetMapping("addleave")
    int addleave(@RequestParam("leave_staff_id")String leave_staff_id,@RequestParam("leave_type")String leave_type,@RequestParam("leave_starttime")String leave_starttime,@RequestParam("leave_deadline")String leave_deadline,@RequestParam("leave_reason")String leave_reason);

    @GetMapping("showStaffLeave")
    List<Map> showStaffLeave();

    @GetMapping("updStaffLeave")
    int updStaffLeave(String leave_id);

    @GetMapping("findStaffLeaveById")
    Map findStaffLeaveById(@RequestParam("staff_id") String staff_id);

    @GetMapping("ckdCourseByStaffId")
    Map ckdCourseByStaffId(@RequestParam("staff_id")String staff_id,@RequestParam("course_time")String course_time);

    @GetMapping("updPersonCenterById")
    int updPersonCenterById(@RequestParam("staff_id")int staff_id,@RequestParam("staff_name") String staff_name,@RequestParam("staff_sex") int staff_sex,@RequestParam("staff_phone") String staff_phone,@RequestParam("staff_address") String staff_address);

    @GetMapping("findStaffByPwd")
    Map findStaffByPwd(@RequestParam("staff_pwd")String staff_pwd,@RequestParam("staff_id")String staff_id);

    @GetMapping("updStaffPwdById")
    int updStaffPwdById(@RequestParam("staff_pwd")String staff_pwd,@RequestParam("staff_id")String staff_id);

    @GetMapping("showStaffLeaved")
    List<Map> showStaffLeaveed();

    @GetMapping("selectStaffLeave")
    List<Map> selectStaffLeave(@RequestParam("start")String start,@RequestParam("end")String end);
}
