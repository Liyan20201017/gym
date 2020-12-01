package com.gym.SpringBoot.controller;

import com.gym.SpringBoot.service.IMemberService;
import com.gym.SpringBoot.service.ISiteService;
import com.gym.entity.Site;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class SiteController {
    @Resource
    private ISiteService iSiteService;

    @RequestMapping("showSite")
    public List<Site> showSite(){
        return iSiteService.showSite();
    }

    @RequestMapping("findSiteById")
    public Site findSiteById(String site_id){
        return iSiteService.findSiteById(site_id);
    }

    @RequestMapping("updSiteById")
    public int updSiteById(String site_id, String site_name, String site_equipmentname) {
        return iSiteService.updSiteById(site_id,site_name,site_equipmentname);
    }

    @RequestMapping("updSiteStateById")
    public int updSiteStateById(String site_id, String site_state) {
        return iSiteService.updSiteStateById(site_id,site_state);
    }

    @RequestMapping("addSite")
    public int addSite(String site_name, String site_equipmentname) {
        return iSiteService.addSite(site_name,site_equipmentname);
    }

    @RequestMapping("chdSiteCourseById")
    public List<Map> chdSiteCourseById(String site_id){
        return iSiteService.chdSiteCourseById(site_id);
    }
}
