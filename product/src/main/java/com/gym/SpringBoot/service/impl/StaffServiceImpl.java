package com.gym.SpringBoot.service.impl;

import com.gym.SpringBoot.dao.IStaffDao;
import com.gym.SpringBoot.service.IStaffService;
import com.gym.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImpl implements IStaffService {

    @Resource
    private IStaffDao iStaffDao;

    @Override
    public int updateStaffById(Staff staff) {
        return iStaffDao.updateStaffById(staff);
    }

    @Override
    public List<Map> showStaff(String staff_name) {
        return iStaffDao.showStaff(staff_name);
    }

    @Override
    public Map findStaffById(Staff staff) {
        return iStaffDao.findStaffById(staff);
    }

    @Override
    public Map findStaffRoleById(Staff staff) {
        return iStaffDao.findStaffRoleById(staff);
    }

    @Override
    public int confirmSetRole(String role_id, String staff_id) {
        return iStaffDao.confirmSetRole(role_id,staff_id);
    }

    public int addRoleStaff(Integer staffid) {
        return iStaffDao.addRoleStaff(staffid);
    }
    @Override
    public int addStaff(Staff staff) {
        int res=iStaffDao.addStaff(staff);
        if(res>0){
            iStaffDao.addRoleStaff(staff.getStaff_id());
        }
        return res;
    }

    @Override
    public Staff findStaffByPhone(Staff staff) {
        return iStaffDao.findStaffByPhone(staff);
    }

    @Override
    public int addleave(String leave_staff_id,String leave_type,String leave_starttime,String leave_deadline,String leave_reason) {
        return iStaffDao.addleave(new Integer(leave_staff_id),leave_type,leave_starttime,leave_deadline,leave_reason);
    }

    @Override
    public List<Map> showStaffLeave() {
        return iStaffDao.showStaffLeave();
    }

    @Override
    public List<Map> showStaffLeaveed() {
        return iStaffDao.showStaffLeaveed();
    }

    @Override
    public List<Map> selectStaffLeave(String start, String end) {
        return iStaffDao.selectStaffLeave(start,end);
    }

    @Override
    public int updStaffLeave(String leave_id) {
        return iStaffDao.updStaffLeave(leave_id);
    }

    @Override
    public Map findStaffLeaveById(String staff_id) {
        return iStaffDao.findStaffLeaveById(staff_id);
    }

    @Override
    public Map ckdCourseByStaffId(String staff_id, String course_time) {
        return iStaffDao.ckdCourseByStaffId(staff_id,course_time);
    }

    @Override
    public int updPersonCenterById(Staff staff) {
        return iStaffDao.updPersonCenterById(staff);
    }

    @Override
    public Map findStaffByPwd(String staff_pwd,String staff_id) {
        return iStaffDao.findStaffByPwd(staff_pwd,staff_id);
    }

    @Override
    public int updStaffPwdById(String staff_pwd, String staff_id) {
        return iStaffDao.updStaffPwdById(staff_pwd,staff_id);
    }
}
