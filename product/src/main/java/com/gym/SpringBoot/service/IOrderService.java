package com.gym.SpringBoot.service;

import com.gym.SpringBoot.service.impl.IOrderServiceImpl;

import java.util.List;
import java.util.Map;

public interface IOrderService{

    List<Map> showCardRecord();

    List<Map> showTopUp();

    List<Map> showOrder();

    List<Map> CalcMax();

    List<Map> calcCardRecord();

    List<Map> calcTopUp();

    List<Map> selectTopUp(String start, String end);

    List<Map> calcOrder();

    List<Map> searchOrder(String start, String end);

    List<Map> searchOrder2(String start, String end);

    List<Map> searchOrder3(String start, String end);

    List<Map> showOrdered();

    List<Map> selectCardRecord(String start, String end);

    List<Map> selectCalcOrder(String start, String end);
}
