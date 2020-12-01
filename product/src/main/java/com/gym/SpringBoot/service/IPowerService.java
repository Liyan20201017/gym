package com.gym.SpringBoot.service;

import com.gym.entity.Menu;

import java.util.List;
import java.util.Map;

public interface IPowerService {
    List<Map> showRole();

    List<Menu> showMenu();

    List<Map> showRoleById(String role_id);

    int updRoleById(String role_id, String powerlist);

    Map ckdRoleName(String role_id);

    int updRoleNameById(String role_id, String role_name);

    int addRoleName(String role_name);

    int addCourseTable(String coursetable_user_id, String coursetable_staff_id, String coursetable_combo_id,String coursetable_time, String coursetable_content);

    List<Map> showCourseTable(String user_id,String staff_id,String combo_id);

    Map findCourseTableById(String user_id, String staff_id, String combo_id, String time);

    int updCourseTable(String coursetable_user_id, String coursetable_staff_id, String coursetable_combo_id, String coursetable_time, String coursetable_content, String coursetable_id);

    Map findCourseTableTimeByOrders(String user_id,String staff_id,String combo_id,String time);
}
