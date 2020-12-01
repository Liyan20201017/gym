package com.gym.SpringBoot.controller;

import com.gym.SpringBoot.service.IStaffService;
import com.gym.entity.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class StaffController {

    @Resource
    private IStaffService iStaffService;

    @RequestMapping("showStaff")
    @CrossOrigin
    public List<Map> showStaff(String staff_name){
        return iStaffService.showStaff(staff_name);
    }

    @RequestMapping("findStaffById")
    @CrossOrigin
    public Map findStaffById(Staff staff){
        System.out.println("prod===="+staff.getStaff_id());
        System.out.println(iStaffService.findStaffById(staff));
        return iStaffService.findStaffById(staff);
    }

    @RequestMapping("updateStaffById")
    @CrossOrigin
    public int updateStaffById(Staff staff){
        System.out.println("这是修改");
        return iStaffService.updateStaffById(staff);
    }

    @RequestMapping("findStaffRoleById")
    @CrossOrigin
    public Map findStaffRoleById(Staff staff){
        System.out.println("这是根据staff_id 查询出role_id"+staff.getStaff_id());
        System.out.println(iStaffService.findStaffRoleById(staff));
        return iStaffService.findStaffRoleById(staff);
    }

    @RequestMapping("confirmSetRole")
    public int confirmSetRole(String role_id,String staff_id){
        return iStaffService.confirmSetRole(role_id,staff_id);
    }

    @RequestMapping("addStaff")
    public int addStaff(Staff staff){
        return iStaffService.addStaff(staff);
    }

    @RequestMapping("findStaffByPhone")
    public Staff findStaffByPhone(Staff staff){
        return iStaffService.findStaffByPhone(staff);
    }


    @RequestMapping("addleave")
    public int addleave(String leave_staff_id,String leave_type,String leave_starttime,String leave_deadline,String leave_reason){
        return iStaffService.addleave(leave_staff_id,leave_type,leave_starttime,leave_deadline,leave_reason);
    }

    @RequestMapping("showStaffLeave")
    public List<Map> showStaffLeave(){
        return iStaffService.showStaffLeave();
    }

    @RequestMapping("showStaffLeaved")
    public List<Map> showStaffLeaveed(){
        System.out.println("jinru zhe ge fang fa");
        System.out.println(iStaffService.showStaffLeaveed());
        return iStaffService.showStaffLeaveed();
    }

    @RequestMapping("selectStaffLeave")
    public List<Map> selectStaffLeave(String start,String end){
        return iStaffService.selectStaffLeave(start,end);
    }

    @RequestMapping("updStaffLeave")
    public int updStaffLeave(String leave_id) {
        return iStaffService.updStaffLeave(leave_id);
    }

    @RequestMapping("findStaffLeaveById")
    public Map findStaffLeaveById(String staff_id) {
        return iStaffService.findStaffLeaveById(staff_id);
    }

    @RequestMapping("ckdCourseByStaffId")
    public Map ckdCourseByStaffId(String staff_id, String course_time) {
        return iStaffService.ckdCourseByStaffId(staff_id,course_time);
    }

    @RequestMapping("updPersonCenterById")
    public int updPersonCenterById(Staff staff) {
        return iStaffService.updPersonCenterById(staff);
    }

    @RequestMapping("findStaffByPwd")
    public Map findStaffByPwd(String staff_pwd,String staff_id){
        return iStaffService.findStaffByPwd(staff_pwd,staff_id);
    }

    @RequestMapping("updStaffPwdById")
    public int updStaffPwdById(String staff_pwd, String staff_id) {
        return iStaffService.updStaffPwdById(staff_pwd,staff_id);
    }
}
