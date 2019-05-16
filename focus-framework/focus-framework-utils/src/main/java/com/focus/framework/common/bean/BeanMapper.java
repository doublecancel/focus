package com.focus.framework.common.bean;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;
import java.util.Set;

@SuppressWarnings("all")
public class BeanMapper {


    private static MapperFacade mapperFacade;

    static {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().useAutoMapping(true).mapNulls(true).build();
        BeanMapper.mapperFacade = mapperFactory.getMapperFacade();
    }

    public static <T> T map(Object source, Class<T> clazz){
        return mapperFacade.map(source, clazz);
    }

    public static <T> List<T> mapList(Iterable data, Class<T> clazz){
        return mapperFacade.mapAsList(data, clazz);
    }


    public static <T> Set<T> mapSet(Iterable data, Class<T> clazz){
        return mapperFacade.mapAsSet(data, clazz);
    }

    public static MapperFacade getMapperFacade() {
        return mapperFacade;
    }
}
