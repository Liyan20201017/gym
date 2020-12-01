package com.ly.SpringBoot.service;

import com.gym.entity.Combo;
import com.gym.entity.Site;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("product")
public interface OrderCourseService {

    @GetMapping("showCourse")
    List<Map> showCourse();

    @GetMapping("showCourseRecord")
    List<Map> showCourseRecord();

    @GetMapping("findCourseById")
    Map findCourseById(@RequestParam("course_id") String course_id);

    @GetMapping("showCoach")
    List<Map> showCoach();

    @GetMapping("updCourseById")
    int updCourseById(@RequestParam("course_id")String course_id,@RequestParam("course_name")String course_name,@RequestParam("course_staff_id") String course_staff_id);

    @GetMapping("showNormalSite")
    List<Site> showNormalSite();

    @GetMapping("addCourse")
    int addCourse(@RequestParam("course_name")String course_name, @RequestParam("course_staff_id")int course_staff_id,@RequestParam("course_site_id") int course_site_id,@RequestParam("course_time") String course_time);


    @GetMapping("showCombo")
    List<Map> showCombo();

    @GetMapping("findComboById")
    Combo findComboById(@RequestParam("combo_id")String combo_id);

    @GetMapping("updComboById")
    int updComboById(@RequestParam("combo_id")int combo_id, @RequestParam("combo_name")String combo_name,@RequestParam("combo_staff_id") String combo_staff_id,@RequestParam("combo_price") String combo_price,@RequestParam("combo_count") String combo_count, @RequestParam("combo_details")String combo_details);

    @GetMapping("addCombo")
    int addCombo(@RequestParam("combo_name")String combo_name,@RequestParam("combo_staff_id") String combo_staff_id,@RequestParam("combo_price") String combo_price,@RequestParam("combo_count") String combo_count,@RequestParam("combo_details") String combo_details);

    @GetMapping("updComboStateById")
    int updComboStateById(@RequestParam("combo_id") String combo_id,@RequestParam("combo_state")String combo_state);

    @GetMapping("addOrder")
    int addOrder(@RequestParam("user_id") String user_id, @RequestParam("order_combo_id")String order_combo_id);

    @GetMapping("ckdCourseByStaffLeaveId")
    List<Map> ckdCourseByStaffLeaveId(@RequestParam("staff_id")String staff_id,@RequestParam("course_time")String course_time);

    @GetMapping("updOrderById")
    int updOrderById(@RequestParam("order_id")String order_id,@RequestParam("staff_id") String staff_id,@RequestParam("order_studytime") String order_studytime);

    @GetMapping("ckdUserComboByStaffId")
    List<Map> ckdUserComboByStaffId(@RequestParam("order_staff_id")String order_staff_id,@RequestParam("order_studytime") String order_studytime);

    @GetMapping("findStaffByLeave")
    List<Map> findStaffByLeave(@RequestParam("leave_staff_id")String leave_staff_id,@RequestParam("leave_time") String leave_time);

    @GetMapping("selectUserCombo")
    List<Map> selectUserCombo(@RequestParam(required = false ,value = "comboid")String comboid, @RequestParam(required = false ,value = "time")String time);

    @GetMapping("selectCombo")
    List<Map> selectCombo(@RequestParam(required = false ,value = "comboid")String comboid);
}
