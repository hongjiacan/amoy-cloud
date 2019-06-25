package amoycloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-21
 */
@SpringBootApplication
@ComponentScan(basePackages = {"amoycloud"})
@EnableHystrix
@EnableFeignClients
public class EurekaConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaConsumerApplication.class,args);
    }
}
