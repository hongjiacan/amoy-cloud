package amoycloud.eureka.producer.service.impl;

import amoycloud.eureka.producer.service.HelloService;
import amoycloud.util.wrapper.WrapMapper;
import amoycloud.util.wrapper.Wrapper;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-25
 */
@Service
public class HelloServiceImpl implements HelloService {


    public Wrapper<String> sayHello(String name){

        String msg = "Hello," + name;
        return WrapMapper.ok(msg);
    }

    public Wrapper<String> sayGoodBye(String name){

        String msg = "Good bye," + name;
        return WrapMapper.ok(msg);
    }
}
