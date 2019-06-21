package com.amoy.cloud.service.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-21
 */
@SpringBootApplication
@EnableFeignClients
public class EurekaConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaConsumerApplication.class,args);
    }
}
