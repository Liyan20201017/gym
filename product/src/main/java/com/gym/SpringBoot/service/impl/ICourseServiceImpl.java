package com.gym.SpringBoot.service.impl;

import com.gym.SpringBoot.dao.ICourseDao;
import com.gym.SpringBoot.service.ICourseService;
import com.gym.entity.Combo;
import com.gym.entity.Course;
import com.gym.entity.Site;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ICourseServiceImpl implements ICourseService {

    @Resource
    private ICourseDao iCourseDao;

    @Override
    public List<Map> showCourse() {
        return iCourseDao.showCourse();
    }

    @Override
    public Map findCourseById(String course_id) {
        return iCourseDao.findCourseById(course_id);
    }

    @Override
    public List<Map> showCoach() {
        return iCourseDao.showCoach();
    }

    @Override
    public int updCourseById(String course_id,String course_name,String course_staff_id ) {
        return iCourseDao.updCourseById(course_id,course_name,course_staff_id);
    }

    @Override
    public List<Site> showNormalSite() {
        return iCourseDao.showNormalSite();
    }

    @Override
    public int addCourse(Course course) {
        return iCourseDao.addCourse(course);
    }

    @Override
    public List<Map> showCombo() {
        return iCourseDao.showCombo();
    }

    @Override
    public Combo findComboById(String combo_id) {
        return iCourseDao.findComboById(combo_id);
    }

    @Override
    public int updComboById(Combo combo) {
        return iCourseDao.updComboById(combo);
    }

    @Override
    public int addCombo(Combo combo) {
        return iCourseDao.addCombo(combo);
    }

    @Override
    public int updComboStateById(String combo_id,String combo_state) {
        return iCourseDao.updComboStateById(combo_id,combo_state);
    }

    @Override
    public int addOrder(String user_id, String order_combo_id) {
        Combo comboById = iCourseDao.findComboById(order_combo_id);
        String combo_count = comboById.getCombo_count();
        String combo_staff_id = comboById.getCombo_staff_id();
        return iCourseDao.addOrder(user_id,order_combo_id,combo_staff_id,combo_count);
    }

    @Override
    public List<Map> showCourseRecord() {
        return iCourseDao.showCourseRecord();
    }

    @Override
    public List<Map> ckdCourseByStaffLeaveId(String staff_id,String course_time) {
        System.out.println("stafff"+staff_id);
        System.out.println("+++"+iCourseDao.ckdCourseByStaffLeaveId(staff_id,course_time));
        return iCourseDao.ckdCourseByStaffLeaveId(staff_id,course_time);
    }

    @Override
    public int updOrderById(String order_id, String staff_id, String order_studytime) {
        return iCourseDao.updOrderById(order_id,staff_id,order_studytime);
    }

    @Override
    public List<Map> ckdUserComboByStaffId(String order_staff_id, String order_studytime) {
        return iCourseDao.ckdUserComboByStaffId(order_staff_id,order_studytime);
    }

    @Override
    public List<Map> findStaffByLeave(String leave_staff_id, String leave_time) {
        return iCourseDao.findStaffByLeave(leave_staff_id,leave_time);
    }

    @Override
    public List<Map> selectCombo(String comboid) {
        return iCourseDao.selectCombo(comboid);
    }

    @Override
    public List<Map> selectUserCombo(String comboid, String start, String end) {
        return iCourseDao.selectUserCombo(comboid,start,end);
    }
}
