package com.focus.framework.base.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ResourceConditionParser {

    private static final Logger logger = LoggerFactory.getLogger(ResourceConditionParser.class);


    public static final String defaultGroup = "group0";

//    public Wrapper parser(Object condition, EntityWrapper wrapper){
//        try {
//            return parser(condition, wrapper, defaultGroup);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

//
//    public Wrapper parser(Object source, EntityWrapper wrapper, String group) throws IllegalAccessException, InstantiationException {
//        Preconditions.checkArgument(group.equals(defaultGroup), "不能使用默认分组名称");
//        Class<?> aClass = source.getClass();
//        Field[] declaredFields = aClass.getDeclaredFields();
//
//        List<ConditionField> collect = Arrays.stream(declaredFields)
//                .map(a -> {
//                    Annotation[] annotations = a.getAnnotations();
//                    List<Annotation> collect1 = Arrays.stream(annotations)
//                            .filter(t -> t.annotationType().isAnnotationPresent(Parser.class))
//                            .collect(Collectors.toList());
//                    return ConditionField.create(a, source, collect1);
//                }).collect(Collectors.toList());
//
//        for (ConditionField conditionField : collect) {
//
//            for (Annotation annotation : conditionField.getAnnotations()) {
//
//                Map<String, Object> annotationAttributes = AnnotationUtils.getAnnotationAttributes(annotation, true);
//                String g = (String) annotationAttributes.get("group");
//                if (!g.equals(group)) {
//                    logger.debug("字段={}，当前组={}，字段分组={}，不相同", conditionField.getField().getName(), group, g);
//                    continue;
//                }
//
//                String enabled = (String) annotationAttributes.get("enabled");
//                if (enabled.equals("false")){
//                    logger.debug("字段={}，当前查询注解={},失效状态。忽略", conditionField.getField().getName(), annotation.getClass().getName());
//                    continue;
//                }
//
//                String reverse = (String) annotationAttributes.get("reverse");
//                boolean r = false;
//                if (reverse.equals("true")){
//                    logger.debug("字段={},当前注解名称={}，反向生成生效", conditionField.getField().getName(), annotation.getClass().getName());
//                    r = true;
//                }
//
//                Parser parser = annotation.getClass().getAnnotation(Parser.class);
//                Class<? extends ConditionParser> value = parser.value();
//
//                conditionField.getField().setAccessible(true);
//                Object v = conditionField.getField().get(source);
//
//                ConditionParser conditionParser = value.newInstance();
//                conditionParser.parser(annotation, r, conditionField.getField(), v,  wrapper);
//            }
//        }
//        return null;
//    }
//


}
