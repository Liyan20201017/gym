package com.ly.SpringBoot.controller;

import com.gym.entity.Staff;
import com.ly.SpringBoot.service.OrderStaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class OrderStaffController {
    @Resource
    private OrderStaffService orderStaffService;

    //调用支付页面
    @RequestMapping("payPage")
    @CrossOrigin
    public String pay(){
        System.out.println("这是支付");
        return "payPage";
    }

    @RequestMapping("showStaff")
    @ResponseBody
    @CrossOrigin
    public List<Map> show(String staff_name){
        return orderStaffService.showStaff(staff_name);
    }

    @RequestMapping("findStaffById")
    @ResponseBody
    @CrossOrigin
    public Map findStaffById(String staff_id){
        return orderStaffService.findStaffById(staff_id);
    }

    @RequestMapping("updateStaffById")
    @ResponseBody
    public int updateStaffById(@RequestParam("staff_id") Integer staff_id,@RequestParam("staff_name") String staff_name, @RequestParam("staff_age") Integer staff_age, @RequestParam("staff_address") String staff_address, @RequestParam("staff_sex") Integer staff_sex, @RequestParam("staff_state") Integer staff_state, @RequestParam("staff_entrytime") String staff_entrytime,@RequestParam("staff_phone") String staff_phone){
        return orderStaffService.updateStaffById(staff_id,staff_name,staff_age,staff_address,staff_sex,staff_state,staff_entrytime,staff_phone);
    }

    @RequestMapping("findStaffRoleById")
    @ResponseBody
    public Map findStaffRoleById(Integer staff_id){
        return orderStaffService.findStaffRoleById(staff_id);
    }

    @RequestMapping("confirmSetRole")
    @ResponseBody
    public int confirmSetRole(String role_id,String staff_id){
        return orderStaffService.confirmSetRole(role_id,staff_id);
    }

    @RequestMapping("addStaff")
    @ResponseBody
    public int addStaff(@RequestParam("staff_name") String staff_name, @RequestParam("staff_age") Integer staff_age, @RequestParam("staff_address") String staff_address, @RequestParam("staff_sex") Integer staff_sex, @RequestParam("staff_entrytime") String staff_entrytime,@RequestParam("staff_phone") String staff_phone){
        return orderStaffService.addStaff(staff_name,staff_age,staff_address,staff_sex,staff_entrytime,staff_phone);
    }

    @RequestMapping("findStaffByPhone")
    @ResponseBody
    public Staff findStaffByPhone(String staff_phone){
        return orderStaffService.findStaffByPhone(staff_phone);
    }

    @RequestMapping("addleave")
    @ResponseBody
    public int addleave(String leave_staff_id,String leave_type,String leave_starttime,String leave_deadline,String leave_reason){
        return orderStaffService.addleave(leave_staff_id,leave_type,leave_starttime,leave_deadline,leave_reason);
    }

    @RequestMapping("showStaffLeave")
    @ResponseBody
    public List<Map> showStaffLeave(){
        return orderStaffService.showStaffLeave();
    }

    @RequestMapping("showStaffLeaved")
    @ResponseBody
    public List<Map> showStaffLeaveed(){
        return orderStaffService.showStaffLeaveed();
    }

    @RequestMapping("selectStaffLeave")
    @ResponseBody
    public List<Map> selectStaffLeave(String time){
        String start=time.substring(0,10);
        String end=time.substring(11);
        return orderStaffService.selectStaffLeave(start,end);
    }

    @RequestMapping("updStaffLeave")
    @ResponseBody
    public int updStaffLeave(String leave_id){
        return orderStaffService.updStaffLeave(leave_id);
    }

    @RequestMapping("findStaffLeaveById")
    @ResponseBody
    public Map findStaffLeaveById(String staff_id){
        return orderStaffService.findStaffLeaveById(staff_id);
    }

    @RequestMapping("ckdCourseByStaffId")
    @ResponseBody
    public Map ckdCourseByStaffId(String staff_id,String course_time){
        return orderStaffService.ckdCourseByStaffId(staff_id,course_time);
    }

    @RequestMapping("updPersonCenterById")
    @ResponseBody
    public int updPersonCenterById(int staff_id,String staff_name,int staff_sex,String staff_phone,String staff_address){
        return orderStaffService.updPersonCenterById(staff_id,staff_name,staff_sex,staff_phone,staff_address);
    }

    @RequestMapping("findStaffByPwd")
    @ResponseBody
    public Map findStaffByPwd(String staff_pwd,String staff_id){
        return orderStaffService.findStaffByPwd(staff_pwd,staff_id);
    }

    @RequestMapping("updStaffPwdById")
    @ResponseBody
    public int updStaffPwdById(String staff_pwd,String staff_id){
        return orderStaffService.updStaffPwdById(staff_pwd,staff_id);
    }

}
