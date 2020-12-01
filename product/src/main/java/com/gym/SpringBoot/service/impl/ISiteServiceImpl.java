package com.gym.SpringBoot.service.impl;

import com.gym.SpringBoot.dao.ISiteDao;
import com.gym.SpringBoot.service.ISiteService;
import com.gym.entity.Site;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ISiteServiceImpl implements ISiteService {

    @Resource
    private ISiteDao iSiteDao;

    @Override
    public List<Site> showSite() {
        return iSiteDao.showSite();
    }

    @Override
    public Site findSiteById(String site_id) {
        return iSiteDao.findSiteById(site_id);
    }

    @Override
    public int updSiteById(String site_id, String site_name, String site_equipmentname) {
        return iSiteDao.updSiteById(site_id,site_name,site_equipmentname);
    }

    @Override
    public int updSiteStateById(String site_id, String site_state) {
        return iSiteDao.updSiteStateById(site_id,site_state);
    }

    @Override
    public int addSite(String site_name, String site_equipmentname) {
        return iSiteDao.addSite(site_name,site_equipmentname);
    }

    @Override
    public List<Map> chdSiteCourseById(String site_id) {
        return iSiteDao.chdSiteCourseById(site_id);
    }
}
