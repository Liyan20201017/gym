package com.gym.SpringBoot.dao;


import com.gym.entity.Member;
import com.gym.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IMemberDao {
    List<Map> showUser(String user_name);
    User findUserById(User user);
    int updateUserById(User user);
    User findUserByPhones(User user);
    Map findUserByMemberState(User user);
    int updateUserByMemberState(User user);
    int updExpireUser();
    int addUser(@Param("user_name")String user_name,@Param("user_phone")String user_phone, @Param("user_starttime")String user_starttime,@Param("member_count")String member_count,@Param("member_id")String member_id);
    Map findMemberCountById(String member_id);
    List<Member> showMember();
    Member findMemberById(String member_id);
    int addCardRecord(@Param("user_id")Integer user_id,@Param("member_id")String member_id);
    int updUserMemberById(@Param("member_count")String member_count,@Param("user_id")String user_id,@Param("member_id")String member_id);

    Map findMemberByPrice(String member_price);

    int updateUserTimeById(@Param("user_id")String user_id,@Param("user_finshtime")String user_finshtime, @Param("member_count")String count);

    int addTopUp(@Param("user_id")String user_id,@Param("member_price")String member_price);
}
