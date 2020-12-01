package com.ly.SpringBoot.service;

import com.gym.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("product")
public interface OrderPowerService {
    @GetMapping("showRole")
    List<Map> showRole();

    @GetMapping("showMenu")
    List<Menu> showMenu();

    @GetMapping("showRoleById")
    List<Map> showRoleById(@RequestParam("role_id") String role_id);

    @GetMapping("updRoleById")
    int updRoleById(@RequestParam("role_id")String role_id,@RequestParam("powerlist")String powerlist);

    @GetMapping("ckdRoleName")
    Map ckdRoleName(@RequestParam("role_id")String role_id);

    @GetMapping("updRoleNameById")
    int updRoleNameById(@RequestParam("role_id")String role_id, @RequestParam("role_name")String role_name);

    @GetMapping("addRoleName")
    int addRoleName(@RequestParam("role_name") String role_name);

    @GetMapping("addCourseTable")
    int addCourseTable(@RequestParam("coursetable_user_id")String coursetable_user_id,@RequestParam("coursetable_staff_id") String coursetable_staff_id,@RequestParam("coursetable_combo_id")String coursetable_combo_id, @RequestParam("coursetable_time")String coursetable_time,@RequestParam("coursetable_content") String coursetable_content);

    @GetMapping("showCourseTable")
    List<Map> showCourseTable(@RequestParam("user_id")String user_id,@RequestParam("staff_id")String staff_id,@RequestParam("combo_id")String combo_id);

    @GetMapping("findCourseTableById")
    Map findCourseTableById(@RequestParam("user_id")String user_id,@RequestParam("staff_id")String staff_id,@RequestParam("combo_id")String combo_id,@RequestParam("time")String time);

    @GetMapping("updCourseTable")
    int updCourseTable(@RequestParam("coursetable_user_id")String coursetable_user_id,@RequestParam("coursetable_staff_id") String coursetable_staff_id,@RequestParam("coursetable_combo_id")String coursetable_combo_id, @RequestParam("coursetable_time")String coursetable_time,@RequestParam("coursetable_content") String coursetable_content,@RequestParam("coursetable_id") String coursetable_id);

    @GetMapping("findCourseTableTimeByOrders")
    Map findCourseTableTimeByOrders(@RequestParam("user_id")String user_id,@RequestParam("staff_id")String staff_id,@RequestParam("combo_id")String combo_id,@RequestParam("time")String time);
}
