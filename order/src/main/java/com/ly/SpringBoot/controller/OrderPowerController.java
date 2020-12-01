package com.ly.SpringBoot.controller;

import com.gym.entity.Menu;
import com.ly.SpringBoot.service.OrderPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class OrderPowerController {

    @Resource
    private OrderPowerService orderPowerService;

    @RequestMapping("showRole")
    public List<Map> showRole(){
        return orderPowerService.showRole();
    }

    @RequestMapping("showMenu")
    public List<Menu> showMenu(){
        return orderPowerService.showMenu();
    }

    @RequestMapping("showRoleById")
    public List<Map> showRoleById(String role_id){
        return orderPowerService.showRoleById(role_id);
    }

    @RequestMapping("updRoleById")
    public int updRoleById(String role_id,String powerlist){
        return orderPowerService.updRoleById(role_id,powerlist);
    }

    @RequestMapping("ckdRoleName")
    public Map ckdRoleName(String role_id){
        return orderPowerService.ckdRoleName(role_id);
    }

    @RequestMapping("updRoleNameById")
    public int updRoleNameById(String role_id,String role_name){
        return orderPowerService.updRoleNameById(role_id,role_name);
    }

    @RequestMapping("addRoleName")
    public int addRoleName(String role_name){
        return orderPowerService.addRoleName(role_name);
    }

    @RequestMapping("addCourseTable")
    public int addCourseTable(String coursetable_user_id,String coursetable_staff_id,String coursetable_combo_id,String coursetable_time,String coursetable_content){
        return orderPowerService.addCourseTable(coursetable_user_id,coursetable_staff_id,coursetable_combo_id,coursetable_time,coursetable_content);
    }

    @RequestMapping("updCourseTable")
    public int updCourseTable(String coursetable_user_id,String coursetable_staff_id,String coursetable_combo_id,String coursetable_time,String coursetable_content,String coursetable_id){
        return orderPowerService.updCourseTable(coursetable_user_id,coursetable_staff_id,coursetable_combo_id,coursetable_time,coursetable_content,coursetable_id);
    }

    @RequestMapping("showCourseTable")
    public List<Map> showCourseTable(String user_id,String staff_id,String combo_id){
        return orderPowerService.showCourseTable(user_id,staff_id,combo_id);
    }

    @RequestMapping("findCourseTableById")
    public Map findCourseTableById(String user_id,String staff_id,String combo_id,String time){
        return orderPowerService.findCourseTableById(user_id,staff_id,combo_id,time);
    }

    @RequestMapping("findCourseTableTimeByOrders")
    public Map findCourseTableTimeByOrders(String user_id,String staff_id,String combo_id,String time){
        return orderPowerService.findCourseTableTimeByOrders(user_id,staff_id,combo_id,time);
    }
}
