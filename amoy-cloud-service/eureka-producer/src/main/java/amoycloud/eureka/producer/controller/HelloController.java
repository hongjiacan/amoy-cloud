package amoycloud.eureka.producer.controller;

import amoycloud.eureka.producer.service.HelloService;
import amoycloud.util.wrapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-20
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public Wrapper<String> sayHello(@RequestParam String name){

        Wrapper<String> wrapper = helloService.sayHello(name);

        if("666".equals(name)){
            throw new RuntimeException();
        }
        return wrapper;
    }

    @RequestMapping("/sayGoodBye")
    public Wrapper<String> sayGoodBye(@RequestParam String name){

        Wrapper<String> wrapper = helloService.sayGoodBye(name);

        return wrapper;
    }
}
