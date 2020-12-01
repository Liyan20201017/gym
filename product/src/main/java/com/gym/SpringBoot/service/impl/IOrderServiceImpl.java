package com.gym.SpringBoot.service.impl;

import com.gym.SpringBoot.dao.IOrderDao;
import com.gym.SpringBoot.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IOrderServiceImpl implements IOrderService {

    @Resource
    private IOrderDao iOrderDao;

    @Override
    public List<Map> showCardRecord() {
        return iOrderDao.showCardRecord();
    }

    @Override
    public List<Map> showTopUp() {
        return iOrderDao.showTopUp();
    }

    @Override
    public List<Map> showOrder() {
        return iOrderDao.showOrder();
    }

    @Override
    public List<Map> CalcMax() {
        Map map1 = iOrderDao.MaxCardRecord();
        Map map2 = iOrderDao.MaxTopUp();
        Map map3 = iOrderDao.MaxOrder();
        List list=new ArrayList();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        return list;
    }

    @Override
    public List<Map> calcCardRecord() {
        return iOrderDao.calcCardRecord();
    }

    @Override
    public List<Map> selectCardRecord(String start, String end) {
        return iOrderDao.selectCardRecord(start,end);
    }

    @Override
    public List<Map> calcTopUp() {
        return iOrderDao.calcTopUp();
    }

    @Override
    public List<Map> selectTopUp(String start, String end) {
        return iOrderDao.selectTopUp(start,end);
    }

    @Override
    public List<Map> calcOrder() {
        return iOrderDao.calcOrder();
    }

    @Override
    public List<Map> selectCalcOrder(String start, String end) {
        return iOrderDao.selectCalcOrder(start,end);
    }

    @Override
    public List<Map> searchOrder(String start, String end) {
        return iOrderDao.searchOrder(start,end);
    }

    @Override
    public List<Map> searchOrder2(String start, String end) {
        return iOrderDao.searchOrder2(start,end);
    }

    @Override
    public List<Map> searchOrder3(String start, String end) {
        return iOrderDao.searchOrder3(start,end);
    }

    @Override
    public List<Map> showOrdered() {
        return iOrderDao.showOrdered();
    }
}
