package com.gym.SpringBoot.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.gym.SpringBoot.dao.IPowerDao;
import com.gym.SpringBoot.service.IPowerService;
import com.gym.entity.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IPowerServiceImpl implements IPowerService {

    @Resource
    private IPowerDao iPowerDao;

    @Override
    public List<Map> showRole() {
        return iPowerDao.showRole();
    }

    @Override
    public List<Menu> showMenu() {
        return iPowerDao.showMenu();
    }

    @Override
    public List<Map> showRoleById(String role_id) {
        return iPowerDao.showRoleById(role_id);
    }

    @Override
    public int updRoleById(String role_id, String powerlist) {
        int res=iPowerDao.delRoleMenu(role_id);
        String[] powerid = powerlist.split(",");
        for (String id:powerid) {
            res+=iPowerDao.addRoleMenu(role_id,id);
        }
        return res;
    }

    @Override
    public Map ckdRoleName(String role_id) {
        return iPowerDao.ckdRoleName(role_id);
    }

    @Override
    public int updRoleNameById(String role_id, String role_name) {
        return iPowerDao.updRoleNameById(role_id,role_name);
    }

    @Override
    public int addRoleName(String role_name) {
        return iPowerDao.addRoleName(role_name);
    }

    @Override
    public int addCourseTable(String coursetable_user_id, String coursetable_staff_id,String coursetable_combo_id, String coursetable_time, String coursetable_content) {
        return iPowerDao.addCourseTable(coursetable_user_id,coursetable_staff_id,coursetable_combo_id,coursetable_time,coursetable_content);
    }

    @Override
    public List<Map> showCourseTable(String user_id,String staff_id,String combo_id) {
        return iPowerDao.showCourseTable(user_id,staff_id,combo_id);
    }

    @Override
    public Map findCourseTableById(String user_id, String staff_id, String combo_id, String time) {
        return iPowerDao.findCourseTableById(user_id,staff_id,combo_id,time);
    }

    @Override
    public int updCourseTable(String coursetable_user_id, String coursetable_staff_id, String coursetable_combo_id, String coursetable_time, String coursetable_content, String coursetable_id) {
        return iPowerDao.updCourseTable(coursetable_user_id,coursetable_staff_id,coursetable_combo_id,coursetable_time,coursetable_content,coursetable_id);
    }

    @Override
    public Map findCourseTableTimeByOrders(String user_id,String staff_id,String combo_id,String time) {
        return iPowerDao.findCourseTableTimeByOrders(user_id,staff_id,combo_id,time);
    }
}

