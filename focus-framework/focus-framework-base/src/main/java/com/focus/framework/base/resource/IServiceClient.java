package com.focus.framework.base.resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.focus.entity.beans.bo.uc.UserInfoBo;
import com.focus.entity.beans.dto.uc.UserInfoDto;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface IServiceClient<DTO, BO, ID extends Serializable> {


    @GetMapping("/{id}")
    BO selectInfoById(@PathVariable("id") ID id);

    @PostMapping("/selectOneByCondition")
    BO selectOneByCondition(@RequestBody Map<String, Object> params);

    @PostMapping("selectOneByWapper")
    BO selectOneByCondition(@RequestBody QueryWrapper wrapper);

    @PostMapping("/saveOrUpdate")
    boolean saveOrUpdate(@RequestBody DTO dto);

    @PostMapping("/selectPaging")
    Page selectPaging(Page page, QueryWrapper wrapper);

    @PostMapping("/selectListByCondition")
    List<BO> selectListByCondition(@RequestBody Map<String, Object> params);

    @PostMapping("/selectListByWapper")
    List<BO> selectListByWapper(@RequestBody QueryWrapper wrapper);

    @DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable("id") Long id);




}
