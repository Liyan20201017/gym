package com.gym.SpringBoot.service;

import com.gym.entity.Combo;
import com.gym.entity.Course;
import com.gym.entity.Site;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ICourseService {
    List<Map> showCourse();
    Map findCourseById(String course_id);

    List<Map> showCoach();

    int updCourseById(String course_id,String course_name,String course_staff_id );

    List<Site> showNormalSite();

    int addCourse(Course course);
    List<Map> showCombo();
    Combo findComboById(String combo_id);

    int updComboById(Combo combo);
    int addCombo(Combo combo);
    int updComboStateById(String combo_id,String combo_state);
    int addOrder(String user_id,String order_combo_id);

    List<Map> showCourseRecord();

    List<Map> ckdCourseByStaffLeaveId(String staff_id,String course_time);

    int updOrderById(String order_id, String staff_id, String order_studytime);

    List<Map> ckdUserComboByStaffId(String order_staff_id, String order_studytime);

    List<Map> findStaffByLeave(String leave_staff_id, String leave_time);

    List<Map> selectCombo(String comboid);

    List<Map> selectUserCombo(String comboid, String start, String end);
}
