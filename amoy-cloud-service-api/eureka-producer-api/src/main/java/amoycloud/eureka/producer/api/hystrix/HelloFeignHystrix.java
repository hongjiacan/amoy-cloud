package amoycloud.eureka.producer.api.hystrix;

import amoycloud.eureka.producer.api.HelloFeignApi;
import amoycloud.util.wrapper.WrapMapper;
import amoycloud.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-25
 */
@Component
public class HelloFeignHystrix implements HelloFeignApi {


    @Override
    public Wrapper<String> sayHello(String name) {
        return WrapMapper.error("Error 500");
    }
//
//    @Override
//    public Wrapper<String> sayGoodBye(String name) {
//        return null;
//    }
}
