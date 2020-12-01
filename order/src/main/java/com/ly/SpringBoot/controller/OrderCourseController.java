package com.ly.SpringBoot.controller;

import com.gym.entity.Combo;
import com.gym.entity.Site;
import com.ly.SpringBoot.service.OrderCourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class OrderCourseController {

    @Resource
    private OrderCourseService orderCourseService;

    @RequestMapping("showCourse")
    public List<Map> showCourse(){
        return orderCourseService.showCourse();
    }

    @RequestMapping("showCourseRecord")
    public List<Map> showCourseRecord(){
        return orderCourseService.showCourseRecord();
    }

    @RequestMapping("ckdCourseByStaffLeaveId")
    public List<Map> ckdCourseByStaffLeaveId(String staff_id,String course_time){
        return orderCourseService.ckdCourseByStaffLeaveId(staff_id,course_time);
    }

    @RequestMapping("findCourseById")
    public Map findCourseById(String course_id){
        return orderCourseService.findCourseById(course_id);
    }

    @RequestMapping("showCoach")
    public List<Map> showCoach(){
        return orderCourseService.showCoach();
    }

    @RequestMapping("updCourseById")
    public int updCourseById(String course_id,String course_name,String course_staff_id ){
        return orderCourseService.updCourseById(course_id,course_name,course_staff_id);
    }

    @RequestMapping("showNormalSite")
    public List<Site> showNormalSite(){
        return orderCourseService.showNormalSite();
    }

    @RequestMapping("addCourse")
    public int addCourse(String course_name,int course_staff_id,int course_site_id,String course_time){
        return orderCourseService.addCourse(course_name,course_staff_id,course_site_id,course_time);
    }

    //以下为私交课程
    @RequestMapping("showCombo")
    public List<Map> showCombo(){
        return orderCourseService.showCombo();
    }


    //以下为私交课程
    @RequestMapping("findComboById")
    public Combo findComboById(String combo_id){
        return orderCourseService.findComboById(combo_id);
    }



    @RequestMapping("updComboById")
    public int updComboById(int combo_id,String combo_name,String combo_staff_id,String combo_price,String combo_count,String combo_details){
        return orderCourseService.updComboById(combo_id,combo_name,combo_staff_id,combo_price,combo_count,combo_details);
    }


    @RequestMapping("addCombo")
    public int addCombo(String combo_name,String combo_staff_id,String combo_price,String combo_count,String combo_details){
        return orderCourseService.addCombo(combo_name,combo_staff_id,combo_price,combo_count,combo_details);
    }

    @RequestMapping("updComboStateById")
    public int updComboStateById(String combo_id,String combo_state){
        return orderCourseService.updComboStateById(combo_id,combo_state);
    }

    @RequestMapping("addOrder")
    public int addOrder(String user_id,String order_combo_id){
        return orderCourseService.addOrder(user_id,order_combo_id);
    }


    @RequestMapping("updOrderById")
    public int updOrderById(String order_id,String staff_id,String order_studytime){
        return orderCourseService.updOrderById(order_id,staff_id,order_studytime);
    }

    @RequestMapping("ckdUserComboByStaffId")
    public List<Map> ckdUserComboByStaffId(String order_staff_id,String order_studytime){
        return orderCourseService.ckdUserComboByStaffId(order_staff_id,order_studytime);
    }

    @RequestMapping("findStaffByLeave")
    public List<Map> findStaffByLeave(String leave_staff_id,String leave_time){
        return orderCourseService.findStaffByLeave(leave_staff_id,leave_time);
    }

    @RequestMapping("selectUserCombo")
    public List<Map> selectUserCombo(String comboid,String time){
        return orderCourseService.selectUserCombo(comboid,time);
    }

    @RequestMapping("selectCombo")
    public List<Map> selectCombo(String comboid){
        return orderCourseService.selectCombo(comboid);
    }
}
