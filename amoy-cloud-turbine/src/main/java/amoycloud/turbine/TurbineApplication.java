package amoycloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @description:
 * @author: hjc
 * @create: 2019-07-01
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args) {

        SpringApplication.run(TurbineApplication.class,args);
    }
}
