package com.ly.SpringBoot.controller;

import com.gym.entity.Site;
import com.gym.entity.User;
import com.ly.SpringBoot.service.OrderMemberService;
import com.ly.SpringBoot.service.OrderSiteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class OrderSiteController {

    @Resource
    private OrderSiteService orderSiteService;

    @RequestMapping("showSite")
    public List<Site> showSite(String user_id){
        return orderSiteService.showSite();
    }


    @RequestMapping("findSiteById")
    public Site findSiteById(String site_id){
        return orderSiteService.findSiteById(site_id);
    }

    @RequestMapping("updSiteById")
    public int updSiteById(String site_id,String site_name,String site_equipmentname){
        return orderSiteService.updSiteById(site_id,site_name,site_equipmentname);
    }

    @RequestMapping("updSiteStateById")
    public int updSiteStateById(String site_id,String site_state){
        return orderSiteService.updSiteStateById(site_id,site_state);
    }

    @RequestMapping("addSite")
    public int addSite(String site_name,String site_equipmentname){
        return orderSiteService.addSite(site_name,site_equipmentname);
    }

    @RequestMapping("chdSiteCourseById")
    public List<Map> chdSiteCourseById(String site_id){
        return orderSiteService.chdSiteCourseById(site_id);
    }

}
