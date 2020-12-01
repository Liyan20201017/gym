package com.ly.SpringBoot.service;

import com.gym.entity.Site;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("product")
public interface OrderSiteService {

    @GetMapping("showSite")
    List<Site> showSite();

    @GetMapping("findSiteById")
    Site findSiteById(@RequestParam("site_id") String site_id);

    @GetMapping("updSiteById")
    int updSiteById(@RequestParam("site_id")String site_id,@RequestParam("site_name") String site_name, @RequestParam("site_equipmentname")String site_equipmentname);

    @GetMapping("updSiteStateById")
    int updSiteStateById(@RequestParam("site_id")String site_id,@RequestParam("site_state") String site_state);

    @GetMapping("addSite")
    int addSite(@RequestParam("site_name")String site_name, @RequestParam("site_equipmentname")String site_equipmentname);

    @GetMapping("chdSiteCourseById")
    List<Map> chdSiteCourseById(@RequestParam("site_id")String site_id);
}
