package com.focus.framework.websocket;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "create")
@Data
public class Response {


    private Integer code;
    private Boolean success;
    private String errorMessage;
    private Object data;

    public static Response ok(Object data){
        return new Response(0, true, "", data);
    }


}
