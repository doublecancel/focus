package com.focus.framework.common.bean;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;
import ma.glasnost.orika.metadata.Type;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class BeanMapper {


    private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private static MapperFacade mapperFacade = mapperFactory.getMapperFacade();


    public static <T> T map(Object source, Class<T> tClass){
        return mapperFacade.map(source, tClass);
    }

    public static <T> T map(Object source, Class<T> tClass, String ...exclude){
        ClassMapBuilder<?, T> tClassMapBuilder = mapperFactory
                .classMap(source.getClass(), tClass);
        for (String s : exclude) {
            tClassMapBuilder.exclude(s);
        }

        tClassMapBuilder.byDefault().register();
        return mapperFactory.getMapperFacade().map(source, tClass);
    }

    public static <T> T map(Object source, Class<T> tClass, Map<String, String> fieldMappings){
        ClassMapBuilder<?, T> tClassMapBuilder = mapperFactory
                .classMap(source.getClass(), tClass);
        fieldMappings.entrySet().stream()
                .forEach(t -> tClassMapBuilder.field(t.getKey(), t.getValue()));

        tClassMapBuilder.byDefault().register();
        return mapperFactory.getMapperFacade().map(source, tClass);
    }


    public static <T> List<T> mapToList(Iterable data, Class<T> tClass){
        return mapperFacade.mapAsList(data, tClass);
    }


    public static <T> Set<T> mapToSet(Iterable data, Class<T> tClass){
        return mapperFacade.mapAsSet(data, tClass);
    }

    public static MapperFacade getMapperFacade(){
        return mapperFacade;
    }

    public static <T, A> T mapWithDate(A source, Class<T> tClass){
        DefaultMapperFactory factory = new DefaultMapperFactory.Builder().build();
        factory.getConverterFactory()
                .registerConverter(new BidirectionalConverter<Date, LocalDateTime>() {
                    @Override
                    public LocalDateTime convertTo(Date source, Type<LocalDateTime> destinationType, MappingContext mappingContext) {
                        return DateFormatter.parse(source);
                    }

                    @Override
                    public Date convertFrom(LocalDateTime source, Type<Date> destinationType, MappingContext mappingContext) {
                        return DateFormatter.parse(source);
                    }
                });
        MapperFacade mapperFacade = factory.getMapperFacade();
        return mapperFacade.map(source, tClass);
    }


}
