package com.gym.SpringBoot.controller;

import com.gym.SpringBoot.dao.IOrderDao;
import com.gym.SpringBoot.service.IOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @Resource
    private IOrderService iOrderService;

    @RequestMapping("showCardRecord")
    public List<Map> showCardRecord() {
        return iOrderService.showCardRecord();
    }

    @RequestMapping("showTopUp")
    public List<Map> showTopUp() {
        return iOrderService.showTopUp();
    }

    @RequestMapping("showOrder")
    public List<Map> showOrder() {
        return iOrderService.showOrder();
    }

    @RequestMapping("CalcMax")
    public List<Map> CalcMax(){
        return iOrderService.CalcMax();
    }

    @RequestMapping("calcCardRecord")
    public List<Map> calcCardRecord(){
        return iOrderService.calcCardRecord();
    }

    @RequestMapping("selectCardRecord")
    public List<Map> selectCardRecord(String start,String end){
        return iOrderService.selectCardRecord(start,end);
    }

    @RequestMapping("calcTopUp")
    public List<Map> calcTopUp() {
        return iOrderService.calcTopUp();
    }

    @RequestMapping("selectTopUp")
    public List<Map> selectTopUp(String start,String end){
        return iOrderService.selectTopUp(start,end);
    }

    @RequestMapping("calcOrder")
    public List<Map> calcOrder() {
        return iOrderService.calcOrder();
    }

    @RequestMapping("selectCalcOrder")
    public List<Map> selectCalcOrder(String start,String end){
        return iOrderService.selectCalcOrder(start,end);
    }

    @RequestMapping("searchOrder")
    public List<Map> searchOrder(String start,String end,String type){
        if("1".equals(type)){
            return iOrderService.searchOrder(start,end);
        }else if("2".equals(type)){
            return iOrderService.searchOrder2(start,end);
        }else{
            return iOrderService.searchOrder3(start,end);
        }
    }

    @RequestMapping("showOrdered")
    public List<Map> showOrdered(){
        return iOrderService.showOrdered();
    }

}
