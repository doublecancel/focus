package com.focus.platform.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.focus.platform.search.dao")
public class SearchApplication {


    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }


}
