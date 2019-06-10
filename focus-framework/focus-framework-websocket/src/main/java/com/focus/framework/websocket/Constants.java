package com.focus.framework.websocket;

public interface Constants {
    //webSocket相关配置
    //链接地址
    String WEB_SOCKET_PATH_PERFIX = "/ws-push";
    String WEB_SOCKET = "/webSocket";
    //消息代理路径
    String TOPIC = "/topic";
    //前端发送给服务端请求地址
    String PATH = "/wsController";

    String ALL = "/topic/notifyAll";

    String USER = "/user";
    //点对点消息推送地址后缀,最后的地址为/user/用户识别码/msg
    String ONE = "/msg";


}
