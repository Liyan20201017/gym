package com.ly.SpringBoot.service;

import com.github.pagehelper.PageInfo;
import com.gym.entity.Member;
import com.gym.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("product")
public interface OrderMemberService {

    @GetMapping("showUser")
    List<Map> showUser(@RequestParam("user_name")String user_name);

    @GetMapping("findUserById")
    User findUserById(@RequestParam("user_id") String user_id);

    @GetMapping("updateUserById")
    int updateUserById(@RequestParam("user_id")Integer user_id,@RequestParam("user_name")String user_name,@RequestParam("user_phone")String user_phone);

    @GetMapping("findUserByPhones")
    User findUserByPhones(@RequestParam("user_phone")String user_phone);

    @GetMapping("findUserByMemberState")
    Map findUserByMemberState(@RequestParam("user_id")String user_id);

    @GetMapping("updateUserByMemberState")
    int updateUserByMemberState(@RequestParam("user_id")String user_id,@RequestParam("user_state")String user_state);

    @GetMapping("updExpireUser")
    int updExpireUser();

    @GetMapping("addUser")
    int addUser(@RequestParam("user_name")String user_name, @RequestParam("user_phone")String user_phone, @RequestParam("user_starttime")String user_starttime, @RequestParam("member_id")String member_id);

    @GetMapping("showMember")
    List<Member> showMember();

    @GetMapping("findMemberById")
    Member findMemberById(@RequestParam("member_id")String member_id);

    @GetMapping("updUserMemberById")
    int updUserMemberById(@RequestParam("user_id")String user_id,@RequestParam("member_id")String member_id);

    @GetMapping("updateUserTimeById")
    int updateUserTimeById(@RequestParam("user_id")String user_id,@RequestParam("member_price") String member_price,@RequestParam("user_finshtime")String user_finshtime);
}
