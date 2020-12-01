package com.gym.SpringBoot.controller;

import com.gym.SpringBoot.service.ICourseService;
import com.gym.entity.Combo;
import com.gym.entity.Course;
import com.gym.entity.Site;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    @Resource
    private ICourseService iCourseService;

    @RequestMapping("showCourse")
    public List<Map> showCourse(){
        return iCourseService.showCourse();
    }

    @RequestMapping("showCourseRecord")
    public List<Map> showCourseRecord(){
        return iCourseService.showCourseRecord();
    }

    @RequestMapping("ckdCourseByStaffLeaveId")
    public List<Map> ckdCourseByStaffLeaveId(String staff_id,String course_time){
        System.out.println("=="+staff_id);
        System.out.println(iCourseService.ckdCourseByStaffLeaveId(staff_id,course_time));
        return iCourseService.ckdCourseByStaffLeaveId(staff_id,course_time);
    }

    @RequestMapping("findCourseById")
    public Map findCourseById(String course_id) {
        return iCourseService.findCourseById(course_id);
    }

    @RequestMapping("showCoach")
    public List<Map> showCoach(){
        return iCourseService.showCoach();
    }

    @RequestMapping("updCourseById")
    public int updCourseById(String course_id,String course_name,String course_staff_id ){
        return iCourseService.updCourseById(course_id,course_name,course_staff_id);
    }

    @RequestMapping("showNormalSite")
    public List<Site> showNormalSite() {
        return iCourseService.showNormalSite();
    }

    @RequestMapping("addCourse")
    public int addCourse(Course course) {
        return iCourseService.addCourse(course);
    }

    @RequestMapping("showCombo")
    public List<Map> showCombo() {
        return iCourseService.showCombo();
    }

    @RequestMapping("findComboById")
    public Combo findComboById(String combo_id) {
        return iCourseService.findComboById(combo_id);
    }

    @RequestMapping("updComboById")
    public int updComboById(Combo combo){
        return iCourseService.updComboById(combo);
    }

    @RequestMapping("addCombo")
    public int addCombo(Combo combo){
        return iCourseService.addCombo(combo);
    }

    @RequestMapping("updComboStateById")
    public int updComboStateById(String combo_id,String combo_state) {
        return iCourseService.updComboStateById(combo_id,combo_state);
    }

    @RequestMapping("addOrder")
    public int addOrder(String user_id, String order_combo_id) {
        System.out.println("添加私人订单成功");
        return iCourseService.addOrder(user_id,order_combo_id);
    }

    @RequestMapping("updOrderById")
    public int updOrderById(String order_id,String staff_id,String order_studytime){
        return iCourseService.updOrderById(order_id,staff_id,order_studytime);
    }

    @RequestMapping("ckdUserComboByStaffId")
    public List<Map> ckdUserComboByStaffId(String order_staff_id,String order_studytime){
        return iCourseService.ckdUserComboByStaffId(order_staff_id,order_studytime);
    }

    @RequestMapping("findStaffByLeave")
    public List<Map> findStaffByLeave(String leave_staff_id,String leave_time){
        return iCourseService.findStaffByLeave(leave_staff_id,leave_time);
    }

    @RequestMapping("selectUserCombo")
    public List<Map> selectUserCombo(String comboid,String time){
        String start=time.substring(0,10);
        String end=time.substring(11);
        return iCourseService.selectUserCombo(comboid,start,end);
    }

    @RequestMapping("selectCombo")
    public List<Map> selectCombo(String comboid){
        return iCourseService.selectCombo(comboid);
    }
}
