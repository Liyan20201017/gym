package com.gym.SpringBoot.service;

import com.github.pagehelper.PageInfo;
import com.gym.entity.Member;
import com.gym.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IMemberService {
    List<Map> showUser(String user_name);
    User findUserById(User user);
    int updateUserById(User user);
    User findUserByPhones(User user);

    Map findUserByMemberState(User user);

    int updateUserByMemberState(User user);

    int updExpireUser();

    int addUser(@Param("user_name")String user_name, @Param("user_phone")String user_phone,@Param("member_count")String member_count, @Param("user_starttime")String user_starttime, @Param("member_id")String member_id);

    List<Member> showMember();
    Map findMemberCountById(String member_id);

    Member findMemberById(String member_id);

    int updUserMemberById(String member_count, String user_id, String member_id);

    int updateUserTimeById(String user_id, String member_price,String user_finshtime);
}
