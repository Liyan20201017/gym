package com.ly.SpringBoot.controller;

import com.github.pagehelper.PageInfo;
import com.gym.entity.Member;
import com.gym.entity.User;
import com.ly.SpringBoot.service.OrderMemberService;
import com.ly.SpringBoot.service.OrderStaffService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class OrderMemberController {
    @Resource
    private OrderMemberService orderMemberService;

    //每天的凌晨1点执行一次
    //@Scheduled(cron="0 0 23 * * ?")
    //@Scheduled(cron="*/5 * * * * ?")
    @RequestMapping("showUser")
    public List<Map> show(String user_name){
       return orderMemberService.showUser(user_name);
    }

    //每天的凌晨1点执行一次
    @Scheduled(cron="0 0 23 * * ?")
    //@Scheduled(cron="*/5 * * * * ?")
    @RequestMapping("updExpireUser")
    public int updExpireUser(){
        System.out.println("每天查看user是否到期");
        return orderMemberService.updExpireUser();
    }


    @RequestMapping("findUserById")
    public User findUserById(String user_id){
        return orderMemberService.findUserById(user_id);
    }

    @RequestMapping("updateUserById")
    public int updateUserById(int user_id,String user_name,String user_phone){
        return orderMemberService.updateUserById(user_id,user_name,user_phone);
    }

    @RequestMapping("findUserByPhones")
    public User findUserByPhones(String user_phone){
        return orderMemberService.findUserByPhones(user_phone);
    }

    @RequestMapping("findUserByMemberState")
    public Map findUserByMemberState(String user_id){
        return orderMemberService.findUserByMemberState(user_id);
    }


    @RequestMapping("updateUserByMemberState")
    public int updateUserByMemberState(String user_id,String user_state){
        return orderMemberService.updateUserByMemberState(user_id,user_state);
    }

    @RequestMapping("addUser")
    public int addUser(String user_name,String user_phone,String user_starttime,String member_id){
        return orderMemberService.addUser(user_name,user_phone,user_starttime,member_id);
    }

    @RequestMapping("showMember")
    public List<Member> showMember(){
        return orderMemberService.showMember();
    }


    @RequestMapping("findMemberById")
    public Member findMemberById(String member_id){
        return orderMemberService.findMemberById(member_id);
    }

    @RequestMapping("updUserMemberById")
    public int updUserMemberById(String user_id,String member_id){
        return orderMemberService.updUserMemberById(user_id,member_id);
    }

    @RequestMapping("updateUserTimeById")
    public int updateUserTimeById(String user_id,String member_price,String user_finshtime){
        return orderMemberService.updateUserTimeById(user_id,member_price,user_finshtime);
    }


}
