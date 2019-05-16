package com.focus.devtools.mybatis.generator.sample.service;

import com.focus.devtools.mybatis.generator.sample.entity.Dict;
import com.focus.devtools.mybatis.generator.sample.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictService {


    @Autowired
    DictMapper mapper;

    public void select(){
        Dict dict = mapper.selectByPrimaryKey(1L);
        System.out.println(dict);
    }

}
