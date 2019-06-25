package amoycloud.eureka.consumer.controller;

import amoycloud.eureka.producer.api.HelloFeignApi;
import amoycloud.util.wrapper.Wrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-25
 */
@RestController
public class ConsumeController {

    @Resource
    public HelloFeignApi helloFeignApi;

    @RequestMapping("/hello")
    public Wrapper<String> hello(@RequestParam String name){

        return helloFeignApi.sayHello(name);
    }
}
