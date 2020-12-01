package com.gym.SpringBoot.service;

import com.gym.entity.Site;

import java.util.List;
import java.util.Map;

public interface ISiteService {
    List<Site> showSite();
    Site findSiteById(String site_id);
    int updSiteById(String site_id,String site_name,String site_equipmentname);
    int updSiteStateById(String site_id,String site_state);
    int addSite(String site_name,String site_equipmentname);
    List<Map> chdSiteCourseById(String site_id);
}
