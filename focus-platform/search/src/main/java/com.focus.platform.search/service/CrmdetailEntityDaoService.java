package com.focus.platform.search.service;

import com.focus.platform.search.dao.CrmdetailEntityDao;
import com.focus.platform.search.dao.CrmdetailEntitySearchDao;
import com.focus.platform.search.entity.CrmdetailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CrmdetailEntityDaoService {


    @Autowired
    private CrmdetailEntityDao crmdetailEntityDao;

    @Autowired
    private CrmdetailEntitySearchDao crmdetailEntitySearchDao;

    public Long count(){
        long count = crmdetailEntityDao.count();
        return count;
    }


    public void putToEs(Integer id){
        Optional<CrmdetailEntity> byId = crmdetailEntityDao.findById(id);
        byId.ifPresent(t -> crmdetailEntitySearchDao.save(t));
    }


}
