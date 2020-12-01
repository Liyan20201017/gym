package com.gym.springBootGateWay.service.impl;

import com.gym.entity.Menu;
import com.gym.entity.Staff;
import com.gym.springBootGateWay.dao.IStaffDao;
import com.gym.springBootGateWay.service.IStaffService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImpl implements IStaffService {

    @Resource
    private IStaffDao iStaffDao;

    @Override
    public List<Menu> findStaffByMenu(Staff staff) {
        return iStaffDao.findStaffByMenu(staff);
    }

    @Override
    public Staff showStaffPhone(Staff staff) {
        return iStaffDao.showStaffPhone(staff);
    }

    @Override
    public Map showStaff(Staff staff) {
        return iStaffDao.showStaff(staff);
    }

    @Override
    public int updStaffLeave(String leave_id) {
        return iStaffDao.updStaffLeave(leave_id);
    }

    @Override
    public int updCourseState(String staff_id,String leave_time,String leave_deadline) {
        return iStaffDao.updCourseState(staff_id,leave_time,leave_deadline);
    }

    @Override
    public int ckdAndUpdStaffState() {
        return iStaffDao.ckdAndUpdStaffState();
    }

    @Override
    public int updateStaffLeaveById(String staff_id) {
        return iStaffDao.updateStaffLeaveById(staff_id);
    }

    @Override
    public int updStaffLeaveFail(String leave_id,String staff_id) {
        int res=iStaffDao.updateStaffLeaveFailById(staff_id);
        if(res>0){
            System.out.println("请求驳回后修改为正常");
        }
        return iStaffDao.updStaffLeaveFail(leave_id);
    }
}
