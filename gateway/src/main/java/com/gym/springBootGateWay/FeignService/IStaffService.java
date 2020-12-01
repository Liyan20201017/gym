package com.gym.springBootGateWay.FeignService;

import com.gym.entity.Staff;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("order")
public interface IStaffService {
    @GetMapping("showStaff")
    List<Staff> showStaff();
}
