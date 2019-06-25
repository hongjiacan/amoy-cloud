package amoycloud.eureka.producer.service;

import amoycloud.util.wrapper.Wrapper;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-25
 */
public interface HelloService {

    public Wrapper<String> sayHello(String name);

    public Wrapper<String> sayGoodBye(String name);
}
