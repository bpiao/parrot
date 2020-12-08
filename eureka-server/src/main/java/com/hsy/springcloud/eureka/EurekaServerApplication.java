package com.hsy.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class EurekaServerApplication {

    public static void main(String[] args) {

        System.out.println(111);
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
