package com.focus.framework.base.resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.focus.framework.base.processors.ClientAutowired;
import com.focus.framework.base.utils.AopTargetUtils;
import com.focus.framework.common.bean.BeanMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public abstract class BaseServiceClientImpl<DTO, BO, ID extends Serializable> implements IServiceClient<DTO, BO, ID> {

    @ClientAutowired
    private ServiceImpl service;


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
    public BO selectOneByCondition(@RequestBody QueryWrapper wrapper) {
        Object one = service.getOne(wrapper);
        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return BeanMapper.map(one, entityClass);
    }

    @Override
    public boolean saveOrUpdate(@RequestBody DTO dto) {

        Class entityClass = (Class) ((ParameterizedType)AopTargetUtils.getTarget(service).getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        Object map = BeanMapper.map(dto, entityClass);
        return service.saveOrUpdate(map);
    }

    @Override
    public Page selectPaging(Page page, QueryWrapper wrapper) {
        Page data = (Page) service.page(page, wrapper);
        return data;
    }

    @Override
    public List<BO> selectListByCondition(@RequestBody Map<String, Object> params) {
        Collection collection = service.listByMap(params);
        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return BeanMapper.mapToList(collection, entityClass);
    }

    @Override
    public List<BO> selectListByWapper(@RequestBody QueryWrapper wrapper) {
        List list = service.list(wrapper);
        Class <BO> entityClass = (Class <BO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return BeanMapper.mapToList(list, entityClass);
    }

    @Override
    public boolean deleteById(@PathVariable("id") Long id) {
        return service.removeById(id);
    }
}
