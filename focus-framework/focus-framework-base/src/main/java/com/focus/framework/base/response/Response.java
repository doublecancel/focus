package com.focus.framework.base.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value(staticConstructor = "create")
@SuppressWarnings("all")
@ApiModel("通用返回对象")
public final class Response<T> {

    @ApiModelProperty("是否成功，true代表成功，false代表失败")
    private Boolean success;//是否成功

    @ApiModelProperty("如果失败则为失败消息，如果成功则为空")
    private String msg;//错误消息

    @ApiModelProperty("如果失败则为错误码，如果成功则为0")
    private Integer code;//错误码

    @ApiModelProperty("成功时返回的数据")
    private T data;//成功时返回的数据，可以是复杂类型或者任何集合类型

    public static Response ok(){
        Response response = Response.create(true, "成功", 200, null);
        return response;
    }

    public static <T> Response ok(T t) {
        return Response.create(true, "成功", 200, t);
    }


    public static Response fail(String message){
        return Response.create(false, message, 500, null);
    }

    public static Response fail(){
        return Response.fail(null);
    }

}
