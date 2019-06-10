package com.focus.framework.canal.adapter;

import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.common.utils.AddressUtils;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.util.List;

@Component
public class CanalAsyncUserInfoToRedis {


    private static final Logger logger = LoggerFactory.getLogger(CanalAsyncUserInfoToRedis.class);

    @Value("${canal.server.ip}")
    private String ip;

    @Value("${canal.server.port}")
    private Integer port;

    @Value("${canal.server.destination}")
    private String destination;


    @Value("${canal.server.filter}")
    private String filter;

    CanalConnector connector = null;

    @PostConstruct
    public void init() {
        connector = CanalConnectors.newSingleConnector(new InetSocketAddress(ip, port), destination, "", "");
        connector.connect();
    }

    @Scheduled(fixedRate = 1000)
    public void handlerUserInfo() {
        connector.subscribe(filter);
        connector.rollback();//回滚到起始点
        Message withoutAck = connector.getWithoutAck(1024);
        if (withoutAck.getEntries().size() < 1 || withoutAck.getId() == -1) {
            logger.debug("无任何变更");
            return;
        }
        List<CanalEntry.Entry> entries = withoutAck.getEntries();
        entries.forEach(this::logEntry);
    }


    private void logEntry (CanalEntry.Entry entry){
        StringBuffer sb = new StringBuffer();
        sb.append("entry.header:" + new Gson().toJson(entry.getHeader()));

    }


}
