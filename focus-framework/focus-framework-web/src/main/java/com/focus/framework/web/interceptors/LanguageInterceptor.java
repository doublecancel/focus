package com.focus.framework.web.interceptors;

import com.focus.framework.base.response.PageHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LanguageInterceptor extends AbstractInterceptor {

    @Autowired
    PageHolder holder;

    @Override
    public String path() {
        return "/**";
    }



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String header = request.getHeader("Accept-Language");
        return true;
    }
}
