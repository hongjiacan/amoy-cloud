package amoycloud.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @description:
 * @author: hjc
 * @create: 2019-07-08
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MonitorApplication {

    public static void main(String[] args) {

        SpringApplication.run(MonitorApplication.class,args);
    }
}
