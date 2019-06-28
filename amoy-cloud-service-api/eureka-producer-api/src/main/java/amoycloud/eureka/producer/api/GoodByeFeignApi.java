package amoycloud.eureka.producer.api;

import amoycloud.eureka.producer.api.hystrix.GoodByeFeignHystrix;
import amoycloud.util.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-26
 */
@FeignClient(value = "eureka-producer", contextId = "goodBye", fallback = GoodByeFeignHystrix.class)
public interface GoodByeFeignApi {

    @RequestMapping("/sayGoodBye")
    public Wrapper<String> sayGoodBye(@RequestParam String name);
}
