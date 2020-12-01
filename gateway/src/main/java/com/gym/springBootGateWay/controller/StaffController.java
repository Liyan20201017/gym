package com.gym.springBootGateWay.controller;

import com.gym.entity.Staff;
import com.gym.springBootGateWay.FeignService.IStaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StaffController {
    @Resource
    private IStaffService iStaffService;

    //用户进行登录
    @RequestMapping("showStaff")
    @CrossOrigin
    @ResponseBody
    public List<Staff> queryMenu(){
        return iStaffService.showStaff();
    }
}
