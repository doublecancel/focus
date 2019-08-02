package com.focus.platform.search.service;

import com.focus.platform.search.dao.CrmdetailEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrmdetailEntityDaoService {


    @Autowired
    private CrmdetailEntityDao crmdetailEntityDaol;

    public Long count(){
        long count = crmdetailEntityDaol.count();
        return count;
    }


}
