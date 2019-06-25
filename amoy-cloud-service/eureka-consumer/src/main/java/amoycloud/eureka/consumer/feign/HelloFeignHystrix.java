package amoycloud.eureka.consumer.feign;

import amoycloud.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-25
 */
//@Component
public class HelloFeignHystrix implements HelloFeign{

    @Override
    public Wrapper<String> sayHello(String name) {
        return null;
    }
}
