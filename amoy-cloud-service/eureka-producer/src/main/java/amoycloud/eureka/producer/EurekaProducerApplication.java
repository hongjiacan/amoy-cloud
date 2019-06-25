package amoycloud.eureka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-20
 */
@SpringBootApplication
@ComponentScan(basePackages = {"amoycloud"})
public class EurekaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerApplication.class,args);
    }
}
