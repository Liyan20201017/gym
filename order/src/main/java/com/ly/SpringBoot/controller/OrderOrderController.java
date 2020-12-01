package com.ly.SpringBoot.controller;

import com.ly.SpringBoot.service.OrderOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class OrderOrderController {

    @Resource
    private OrderOrderService orderOrderService;

    @RequestMapping("showCardRecord")
    public List<Map> showCardRecord(){
        return orderOrderService.showCardRecord();
    }


    @RequestMapping("showTopUp")
    public List<Map> showTopUp(){
        return orderOrderService.showTopUp();
    }


    @RequestMapping("showOrder")
    public List<Map> showOrder(){
        return orderOrderService.showOrder();
    }


    @RequestMapping("CalcMax")
    public List<Map> CalcMax(){
        return orderOrderService.CalcMax();
    }

    @RequestMapping("calcCardRecord")
    public List<Map> calcCardRecord(){
        return orderOrderService.calcCardRecord();
    }
    @RequestMapping("selectCardRecord")
    public List<Map> selectCardRecord(String time){
        System.out.println(time);
        String start=time.substring(0,10);
        String end=time.substring(11);
        return orderOrderService.selectCardRecord(start,end);
    }

    @RequestMapping("selectCalcOrder")
    public List<Map> selectCalcOrder(String time){
        System.out.println(time);
        String start=time.substring(0,10);
        String end=time.substring(11);
        return orderOrderService.selectCalcOrder(start,end);
    }

    @RequestMapping("calcTopUp")
    public List<Map> calcTopUp(){
        return orderOrderService.calcTopUp();
    }

    @RequestMapping("selectTopUp")
    public List<Map> selectTopUp(String time){
        System.out.println(time);
        String start=time.substring(0,10);
        String end=time.substring(11);
        return orderOrderService.selectTopUp(start,end);
    }

    @RequestMapping("calcOrder")
    public List<Map> calcOrder(){
        return orderOrderService.calcOrder();
    }

    @RequestMapping("searchOrder")
    public List<Map> searchOrder(String time,String type){
        System.out.println(time);
        String start=time.substring(0,10);
        String end=time.substring(11);
        return orderOrderService.searchOrder(start,end,type);
    }

    @RequestMapping("showOrdered")
    public List<Map> showOrdered(){
        return orderOrderService.showOrdered();
    }

}
