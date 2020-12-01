package com.gym.springBootGateWay.controller;

import com.gym.entity.Menu;
import com.gym.entity.Staff;
import com.gym.springBootGateWay.entity.ReturnData;
import com.gym.springBootGateWay.service.IStaffService;
import com.gym.springBootGateWay.util.JwtUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Resource
    private IStaffService iStaffService;

    @Value("${my.jwt.effective-time}")
    private String effectiveTime;
    @Autowired
    private ObjectMapper objectMapper;

    //用户进行登录
    @RequestMapping("/login")
    @CrossOrigin
    @ResponseBody
    public ReturnData<String> login(Staff staff) throws Exception {
        //查询该员工菜单信息
        List<Menu> menuByStaff=new ArrayList<>();
        // Account ac=this.authService.getJwtUser(account);//自定义验证前端传过来的用户名密码是否正确，使用者自行修改。
        Map staff1 = iStaffService.showStaff(staff);
        if (staff1!=null) {
            menuByStaff = iStaffService.findStaffByMenu(staff);
            int effectivTimeInt = Integer.valueOf(effectiveTime.substring(0, effectiveTime.length() - 1));
            String effectivTimeUnit = effectiveTime.substring(effectiveTime.length() - 1, effectiveTime.length());
            String jwt = null;
            switch (effectivTimeUnit) {
                case "s": {
                    //秒
                    jwt = JwtUtil.createJWT("qmy", "0339", objectMapper.writeValueAsString(staff), effectivTimeInt * 1000L);
                    break;
                }
                case "m": {
                    //分钟
                    jwt = JwtUtil.createJWT("qmy", "0339", objectMapper.writeValueAsString(staff), effectivTimeInt * 60L * 1000L);
                    break;
                }
                case "h": {
                    //小时
                    jwt = JwtUtil.createJWT("qmy", "0339", objectMapper.writeValueAsString(staff), effectivTimeInt * 60L * 60L * 1000L);
                    break;
                }
                case "d": {
                    //小时
                    jwt = JwtUtil.createJWT("qmy", "0339", objectMapper.writeValueAsString(staff), effectivTimeInt * 24L * 60L * 60L * 1000L);
                    break;
                }
            }
                return new ReturnData<String>(200, "认证成功", jwt,staff1,menuByStaff);
        } else {
            return new ReturnData<String>(401, "认证失败，用户名或密码错误，请重新输入", null,null,null);
        }
    }


    //用户进行登录
    @RequestMapping("/queryMenu")
    @CrossOrigin
    @ResponseBody
    public List<Menu> queryMenu(Staff staff){
        System.out.println(iStaffService.findStaffByMenu(staff));
        return iStaffService.findStaffByMenu(staff);
    }
}
