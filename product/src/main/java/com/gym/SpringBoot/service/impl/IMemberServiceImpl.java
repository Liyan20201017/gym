package com.gym.SpringBoot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.SpringBoot.dao.*;
import com.gym.SpringBoot.service.*;
import com.gym.entity.Member;
import com.gym.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class IMemberServiceImpl implements IMemberService{

    @Resource
    private IMemberDao iMemberDao;

    @Override
    public List<Map> showUser(String user_name) {
        return iMemberDao.showUser(user_name);
    }

    @Override
    public User findUserById(User user) {
        return iMemberDao.findUserById(user);
    }

    @Override
    public int updateUserById(User user) {
        return iMemberDao.updateUserById(user);
    }

    @Override
    public User findUserByPhones(User user) {
        return iMemberDao.findUserByPhones(user);
    }

    @Override
    public Map findUserByMemberState(User user) {
        return iMemberDao.findUserByMemberState(user);
    }

    @Override
    public int updateUserByMemberState(User user) {
        return iMemberDao.updateUserByMemberState(user);
    }

    @Override
    public int updExpireUser() {
        return iMemberDao.updExpireUser();
    }

    @Override
    public int addUser(String user_name, String user_phone, String user_starttime, String member_count, String member_id) {
        int res = iMemberDao.addUser(user_name, user_phone, user_starttime, member_count, member_id);
        if(res>0){
            User user=new User();
            user.setUser_phone(user_phone);
            User userByPhones = iMemberDao.findUserByPhones(user);
            res=iMemberDao.addCardRecord(userByPhones.getUser_id(),member_id);
        }
        return res;
    }

    @Override
    public List<Member> showMember() {
        return iMemberDao.showMember();
    }

    @Override
    public Map findMemberCountById(String member_id) {
        return iMemberDao.findMemberCountById(member_id);
    }

    @Override
    public Member findMemberById(String member_id) {
        return iMemberDao.findMemberById(member_id);
    }

    @Override
    public int updUserMemberById(String member_count, String user_id, String member_id) {
        Integer userid=new Integer(user_id);
        int res=iMemberDao.addCardRecord(userid,member_id);
        System.out.println("zhe ge fangfa meizyou1");
        if(res>0){
            System.out.println("更改会员卡添加到开卡记录表中");
        }else{
            System.out.println("没有=====更改会员卡添加到开卡记录表中");
        }
        return iMemberDao.updUserMemberById(member_count,user_id,member_id);
    }

    @Override
    public int updateUserTimeById(String user_id, String member_price,String user_finshtime) {
        int i = iMemberDao.addTopUp(user_id, member_price);
        if(i>0){
            System.out.println("topup success");
        }
        Map member=iMemberDao.findMemberByPrice(member_price);
        String count=member.get("member_count").toString();
        System.out.println("获取到的天数===="+count);
        User user=new User();
        user.setUser_id(new Integer(user_id));
        User user1=iMemberDao.findUserById(user);
        System.out.println("充值前到期时间===="+user1.getUser_finshtime());
        int res=iMemberDao.updateUserTimeById(user_id,user1.getUser_finshtime(),count);
        return res;
    }

}
