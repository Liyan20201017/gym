package com.gym.SpringBoot.controller;

import com.gym.SpringBoot.service.IPowerService;
import com.gym.entity.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class PowerController {

    @Resource
    private IPowerService iPowerService;

    @RequestMapping("showRole")
    public List<Map> showRole(){
        return iPowerService.showRole();
    }

    @RequestMapping("showMenu")
    public List<Menu> showMenu(){
        return iPowerService.showMenu();
    }

    @RequestMapping("showRoleById")
    public List<Map> showRoleById(String role_id){
        return iPowerService.showRoleById(role_id);
    }

    @RequestMapping("updRoleById")
    public int updRoleById(String role_id,String powerlist){
        return iPowerService.updRoleById(role_id,powerlist);
    }

    @RequestMapping("ckdRoleName")
    public Map ckdRoleName(String role_id){
        return iPowerService.ckdRoleName(role_id);
    }

    @RequestMapping("updRoleNameById")
    public int updRoleNameById(String role_id,String role_name){
        return iPowerService.updRoleNameById(role_id,role_name);
    }

    @RequestMapping("addRoleName")
    public int addRoleName(String role_name){
        return iPowerService.addRoleName(role_name);
    }

    @RequestMapping("addCourseTable")
    public int addCourseTable(String coursetable_user_id,String coursetable_staff_id,String coursetable_combo_id,String coursetable_time,String coursetable_content){
        return iPowerService.addCourseTable(coursetable_user_id,coursetable_staff_id,coursetable_combo_id,coursetable_time,coursetable_content);
    }

    @RequestMapping("showCourseTable")
    public List<Map> showCourseTable(String user_id,String staff_id,String combo_id){
        return iPowerService.showCourseTable(user_id,staff_id,combo_id);
    }

    @RequestMapping("findCourseTableById")
    public Map findCourseTableById(String user_id,String staff_id,String combo_id,String time){
        return iPowerService.findCourseTableById(user_id,staff_id,combo_id,time);
    }

    @RequestMapping("updCourseTable")
    public int updCourseTable(String coursetable_user_id,String coursetable_staff_id,String coursetable_combo_id,String coursetable_time,String coursetable_content,String coursetable_id){
        return iPowerService.updCourseTable(coursetable_user_id,coursetable_staff_id,coursetable_combo_id,coursetable_time,coursetable_content,coursetable_id);
    }

    @RequestMapping("findCourseTableTimeByOrders")
    public Map findCourseTableTimeByOrders(String user_id,String staff_id,String combo_id,String time){
        return iPowerService.findCourseTableTimeByOrders(user_id,staff_id,combo_id,time);
    }

}
