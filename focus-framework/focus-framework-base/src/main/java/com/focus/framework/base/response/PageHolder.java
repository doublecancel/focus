package com.focus.framework.base.response;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Data
@Component
public class PageHolder {

    public Integer page;
    public Integer limit;


    public Integer getStart(){
        return (page - 1) * getLimit();
    }

}
