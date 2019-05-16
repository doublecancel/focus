package com.focus.framework.web.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public abstract class AbstractInterceptor extends HandlerInterceptorAdapter {


    public abstract String path();


}
