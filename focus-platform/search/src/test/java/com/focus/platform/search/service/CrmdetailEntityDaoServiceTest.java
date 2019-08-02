package com.focus.platform.search.service;

import com.focus.platform.search.SearchApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SearchApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrmdetailEntityDaoServiceTest {


    @Autowired
    private CrmdetailEntityDaoService service;

    @Test
    public void count() {
        System.out.println(service.count());
    }



    @Test
    public void putToEs(){
        service.putToEs(5666211);
    }

}