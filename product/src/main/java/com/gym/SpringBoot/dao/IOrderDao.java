package com.gym.SpringBoot.dao;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

public interface IOrderDao {
    List<Map> showCardRecord();

    List<Map> showTopUp();

    List<Map> showOrder();

    Map MaxCardRecord();

    Map MaxTopUp();

    Map MaxOrder();

    List<Map> calcCardRecord();

    List<Map> selectCardRecord(String start, String end);

    List<Map> calcTopUp();

    List<Map> selectTopUp(String start, String end);

    List<Map> calcOrder();

    List<Map> selectCalcOrder(String start, String end);

    List<Map> searchOrder(String start, String end);

    List<Map> searchOrder2(String start, String end);

    List<Map> searchOrder3(String start, String end);

    List<Map> showOrdered();
}
