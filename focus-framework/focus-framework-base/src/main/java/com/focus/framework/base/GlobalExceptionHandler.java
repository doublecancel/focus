package com.focus.framework.base;

import com.focus.framework.base.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * controller抛出异常捕捉
 */
@RestControllerAdvice(annotations = {RestController.class, Controller.class})
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = LoginException.class)
    public Response assertErrorHandler(LoginException ex, HttpServletResponse response, HttpServletRequest request) {
        Response resp = Response.fail(ex.getMessage());
        return resp;
    }



    @ExceptionHandler(value = Exception.class)
    public Response assertErrorHandler(Exception ex, HttpServletResponse response, HttpServletRequest request) {
        LOGGER.error("发生异常：", ex    );
        Response resp = Response.fail(ex.getMessage());
        return resp;
    }

}
