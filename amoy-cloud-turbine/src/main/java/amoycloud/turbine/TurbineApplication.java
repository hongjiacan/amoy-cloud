package amoycloud.turbine;

//import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: hjc
 * @create: 2019-07-01
 */
@SpringBootApplication
//@EnableHystrixDashboard
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args) {

        SpringApplication.run(TurbineApplication.class,args);
    }

//    @Bean
//    public ServletRegistrationBean hystrixMetricsStreamServlet() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
//        registration.addUrlMappings("/turbine.stream");
//        return registration;
//    }
}
