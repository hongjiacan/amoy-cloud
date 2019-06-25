package amoycloud.eureka.consumer.feign;

import amoycloud.util.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-25
 */
@FeignClient(value = "eureka-producer",fallback = HelloFeignHystrix.class)
public interface HelloFeign {

    @RequestMapping(value = "/sayHello")
    public Wrapper<String> sayHello(@RequestParam String name);
}
