package com.amoy.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmoyCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmoyCloudEurekaApplication.class, args);
    }

}
