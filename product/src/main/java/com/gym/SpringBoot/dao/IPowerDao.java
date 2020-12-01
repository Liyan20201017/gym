package com.gym.SpringBoot.dao;

import com.gym.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IPowerDao {
    List<Map> showRole();

    List<Menu> showMenu();

    List<Map> showRoleById(String role_id);

    int delRoleMenu(String role_id);

    int addRoleMenu(@Param("role_id") String role_id,@Param("id") String id);

    Map ckdRoleName(String role_id);

    int updRoleNameById(@Param("role_id")String role_id,@Param("role_name")String role_name);

    int addRoleName(String role_name);

    int addCourseTable(@Param("coursetable_user_id")String coursetable_user_id, @Param("coursetable_staff_id")String coursetable_staff_id,@Param("coursetable_combo_id")String coursetable_combo_id,@Param("coursetable_time") String coursetable_time, @Param("coursetable_content")String coursetable_content);

    List<Map> showCourseTable(@Param("user_id")String user_id,@Param("staff_id")String staff_id,@Param("combo_id")String combo_id);

    Map findCourseTableById(@Param("user_id")String user_id,@Param("staff_id")String staff_id,@Param("combo_id")String combo_id,@Param("time")String time);

    int updCourseTable(@Param("coursetable_user_id")String coursetable_user_id, @Param("coursetable_staff_id")String coursetable_staff_id,@Param("coursetable_combo_id")String coursetable_combo_id,@Param("coursetable_time") String coursetable_time, @Param("coursetable_content")String coursetable_content,@Param("coursetable_id")String coursetable_id);

    Map findCourseTableTimeByOrders(@Param("user_id")String user_id,@Param("staff_id")String staff_id,@Param("combo_id")String combo_id,@Param("time")String time);

    List<Map> showMenuById();
}
