package com.focus.framework.websocket;


import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "create")
public class Response {


    private Integer code;
    private Boolean success;
    private String errorMessage;
    private Object data;

    public static Response ok(Object data){
        return new Response(0, true, "", data);
    }


}
