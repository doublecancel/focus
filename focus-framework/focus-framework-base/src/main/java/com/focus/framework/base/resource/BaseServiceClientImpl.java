package com.focus.framework.base.resource;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.focus.framework.base.processors.ClientAutowired;
import com.focus.framework.base.utils.AopTargetUtils;
import com.focus.framework.common.bean.BeanMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public abstract class BaseServiceClientImpl<DTO, BO, ID extends Serializable> implements IServiceClient<DTO, BO, ID> {

    @ClientAutowired
    private ServiceImpl service;

    ResourceConditionParser parser = new ResourceConditionParser();

    @Override
    public BO selectInfoById(@PathVariable("id") ID id) {
        Object byId = service.getById(id);
        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return BeanMapper.map(byId, entityClass);
    }

    @Override
    public BO selectOneByCondition(@RequestBody Map<String, Object> params) {
        Collection collection = service.listByMap(params);
        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        if (collection.isEmpty()) return null;
        Object o = collection.stream().findFirst().get();
        return BeanMapper.map(o, entityClass);
    }

    @Override
    public BO selectOneByCondition(@RequestBody Object condition) {
//        Wrapper wrapper = parser.parser(condition, wrapper1);
//        Object one = (Object) service.list(wrapper);
//        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
//        return BeanMapper.map(one, entityClass);
        return null;
    }

    @Override
    public boolean saveOrUpdate(@RequestBody DTO dto) {

        Class entityClass = (Class) ((ParameterizedType)AopTargetUtils.getTarget(service).getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        Object map = BeanMapper.map(dto, entityClass);
        return service.saveOrUpdate(map);
    }

    @Override
    public Page selectPaging(@PathVariable("page") Integer page, @PathVariable("pageSize") Integer pageSize, @RequestParam("wrapper") Object condition) {
        Page p = new Page();
        p.setSearchCount(true);
        p.setCurrent(page);
        p.setSize(pageSize);
        Wrapper wrapper = parser.parser(condition, null);
        Page data = (Page) service.page(p, wrapper);
        return data;
    }

    @Override
    public List<BO> selectListByCondition(@RequestBody Map<String, Object> params) {
        Collection collection = service.listByMap(params);
        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return BeanMapper.mapToList(collection, entityClass);
    }

    @Override
    public List<BO> selectListByWapper(@RequestBody Object condition) {
        Wrapper wrapper = parser.parser(condition, null);
        List list = service.list(wrapper);
        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return BeanMapper.mapToList(list, entityClass);
    }

    @Override
    public boolean deleteById(@PathVariable("id") Long id) {
        return service.removeById(id);
    }
}
