package com.focus.framework.base.resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.entity.beans.dto.uc.UserInfoDto;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 1.通用的類可以使用泛型
 * 2.mybatis-plus包裝的wrapper無法進行序列化，所以无法使用
 * 3.这里暂时只能使用map集合进行传值
 * 4.可以自定义注解的方式进行查询，这样就可以进行序列化进入服务端，进入服务端之后再进行解析转换为wrapper进行查询，从而实现通用查询，参考实现：https://gitee.com/leecho/cola-cloud
 *  进入服务端之后，会根据接口上的dto或者bo的名字进行注入相对应的service，这里是自定义了注解ClientAutowired，然后实现了BeanPostProcessor,解析泛型上的属性进行注入的
 *  大概的思路是这样，并且一定能够实现，由于时间关系这里暂时就不实现了。
 * 5.在启动时feign如果name重复会抛出异常，这里设置了属性spring.main.allow-bean-definition-overriding=true,意思应该是后面定义的bean的属性会覆盖前面的，这里是一个临时的解决方案，
 *  正确的方式暂时还没有找到
 * @param <DTO>
 * @param <BO>
 * @param <ID>
 */
public interface IServiceClient<DTO, BO, ID extends Serializable> {


    @GetMapping("/{id}")
    BO selectInfoById(@PathVariable("id") ID id);

    @PostMapping("/selectOneByCondition")
    BO selectOneByCondition(@RequestBody Map<String, Object> params);

    @PostMapping("selectOneByWapper")
    BO selectOneByCondition(@RequestBody QueryWrapper wrapper);

    @PostMapping("/saveOrUpdate")
    boolean saveOrUpdate(@RequestBody DTO dto);

    @PostMapping("/selectPaging/{page}/{pageSize}")
    Page selectPaging(@PathVariable("page") Integer page, @PathVariable("pageSize") Integer pageSize, @RequestParam("wrapper") QueryWrapper wrapper);

    @PostMapping("/selectListByCondition")
    List<BO> selectListByCondition(@RequestBody Map<String, Object> params);

    @PostMapping("/selectListByWapper")
    List<BO> selectListByWapper(@RequestBody QueryWrapper wrapper);

    @DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable("id") Long id);




}
