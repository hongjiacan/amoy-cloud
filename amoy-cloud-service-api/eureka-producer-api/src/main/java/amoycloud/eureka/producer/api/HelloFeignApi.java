package amoycloud.eureka.producer.api;

import amoycloud.eureka.producer.api.hystrix.HelloFeignHystrix;
import amoycloud.util.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-25
 */
@FeignClient(value = "eureka-producer", contextId = "hello", fallback = HelloFeignHystrix.class)
public interface HelloFeignApi {

    @RequestMapping(value = "/sayHello")
    public Wrapper<String> sayHello(@RequestParam String name);

//    @RequestMapping("/sayGoodBye")
//    public Wrapper<String> sayGoodBye(@RequestParam String name);
}
