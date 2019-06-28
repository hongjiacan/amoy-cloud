package amoycloud.eureka.producer.api.hystrix;

import amoycloud.eureka.producer.api.GoodByeFeignApi;
import amoycloud.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-26
 */
@Component
public class GoodByeFeignHystrix implements GoodByeFeignApi {

    @Override
    public Wrapper<String> sayGoodBye(String name) {
        return null;
    }
}
