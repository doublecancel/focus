package com.focus.framework.base.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@ApiModel("内部接口调用返回的通用对象")
@Data
@AllArgsConstructor(staticName = "create")
public class R<T> {

    @ApiModelProperty("是否成功")
    private Boolean success;

    @ApiModelProperty("返回的数据")
    private T t;

    @ApiModelProperty("如果失败，异常的对象")
    private Exception e;

    @ApiModelProperty("自定义失败的信息")
    private String message;

    public static R success(){
        return R.create(true, null, null, null);
    }

    public static <T> R success(T t){
        return R.create(true, t, null, null);
    }

    public static <T> R fail(String message){
        return R.create( false, null, null, message);
    }

    public static <T> R fail(){
        return R.create(false, null, null, null);
    }

    public static <T> R fail(Exception e){
        return R.create(false, null, e, null);
    }




}
