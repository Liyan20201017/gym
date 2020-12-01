package com.ly.SpringBoot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("product")
public interface OrderOrderService {

    @GetMapping("showCardRecord")
    List<Map> showCardRecord();

    @GetMapping("showTopUp")
    List<Map> showTopUp();

    @GetMapping("showOrder")
    List<Map> showOrder();

    @GetMapping("showOrdered")
    List<Map> showOrdered();

    @GetMapping("CalcMax")
    List<Map> CalcMax();

    @GetMapping("calcCardRecord")
    List<Map> calcCardRecord();

    @GetMapping("calcTopUp")
    List<Map> calcTopUp();

    @GetMapping("calcOrder")
    List<Map> calcOrder();

    @GetMapping("searchOrder")
    List<Map> searchOrder(@RequestParam("start") String start, @RequestParam("end")String end,@RequestParam("type")String type);

    @GetMapping("selectCardRecord")
    List<Map> selectCardRecord(@RequestParam("start")String start,@RequestParam("end")String end);

    @GetMapping("selectCalcOrder")
    List<Map> selectCalcOrder(@RequestParam("start")String start,@RequestParam("end")String end);

    @GetMapping("selectTopUp")
    List<Map> selectTopUp(@RequestParam("start")String start,@RequestParam("end")String end);
}
