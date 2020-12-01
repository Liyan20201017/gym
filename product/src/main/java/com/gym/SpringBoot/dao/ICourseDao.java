package com.gym.SpringBoot.dao;

import com.gym.entity.Combo;
import com.gym.entity.Course;
import com.gym.entity.Site;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface ICourseDao {
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
    int addOrder(@Param("user_id")String user_id,@Param("order_combo_id")String order_combo_id,@Param("combo_staff_id")String combo_staff_id,@Param("combo_count")String combo_count);

    List<Map> showCourseRecord();

    List<Map> ckdCourseByStaffLeaveId(@Param("staff_id") String staff_id,@Param("course_time")String course_time);
    int updOrderById(@Param("order_id") String order_id,@Param("staff_id") String staff_id,@Param("order_studytime") String order_studytime);

    List<Map> ckdUserComboByStaffId(@Param("order_staff_id")String order_staff_id,@Param("order_studytime")String order_studytime);

    List<Map> findStaffByLeave(@Param("leave_staff_id")String leave_staff_id, @Param("leave_time")String leave_time);

    List<Map> selectCombo(String comboid);
    List<Map> selectUserCombo(String comboid, String start, String end);
}
