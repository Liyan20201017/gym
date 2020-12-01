package com.gym.SpringBoot.controller;

import com.github.pagehelper.PageInfo;
import com.gym.SpringBoot.service.IMemberService;
import com.gym.entity.Member;
import com.gym.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class MemberController {
    @Resource
    private IMemberService iMemberService;

    @RequestMapping("showUser")
    public List<Map> showUser(String user_name){
        return iMemberService.showUser(user_name);
    }


    @RequestMapping("findUserById")
    public User findUserById(User user){
        return iMemberService.findUserById(user);
    }

    @RequestMapping("updateUserById")
    public int updateUserById(User user){
        return iMemberService.updateUserById(user);
    }

    @RequestMapping("findUserByPhones")
    public User findUserByPhones(User user){
        System.out.println(user.getUser_phone());
        return iMemberService.findUserByPhones(user);
    }

    @RequestMapping("findUserByMemberState")
    public Map findUserByMemberState(User user){
        return iMemberService.findUserByMemberState(user);
    }


    @RequestMapping("updateUserByMemberState")
    public int updateUserByMemberState(User user){
        return iMemberService.updateUserByMemberState(user);
    }

    @RequestMapping("updExpireUser")
    public int updExpireUser(){
        return iMemberService.updExpireUser();
    }

    @RequestMapping("addUser")
    public int addUser(String user_name,String user_phone,String user_starttime,String member_id){
        Map memberCount = iMemberService.findMemberCountById(member_id);
        System.out.println(memberCount.get("member_count")+"========");
        return iMemberService.addUser(user_name,user_phone,user_starttime,memberCount.get("member_count").toString(),member_id);
    }


    @RequestMapping("showMember")
    public List<Member> showMember(){
        return iMemberService.showMember();
    }

    @RequestMapping("findMemberById")
    public Member findMemberById(String member_id){
        return iMemberService.findMemberById(member_id);
    }


    @RequestMapping("updUserMemberById")
    public int updUserMemberById(String user_id,String member_id){
        Map memberCount = iMemberService.findMemberCountById(member_id);
        System.out.println(memberCount.get("member_count")+"========获得的天数");
        return iMemberService.updUserMemberById(memberCount.get("member_count").toString(),user_id,member_id);
    }

    @RequestMapping("updateUserTimeById")
    public int updateUserTimeById(String user_id,String member_price,String user_finshtime){
        return iMemberService.updateUserTimeById(user_id,member_price,user_finshtime);
    }

}
