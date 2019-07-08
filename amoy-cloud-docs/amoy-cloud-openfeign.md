# amoy-cloud-openfeign

### 相关配置

- pom 引用
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
</dependency>
```

- Application 添加注解
```
@ComponentScan(basePackages = "amoycloud")
@EnableFeignClients(basePackages = "amoycloud")
##启用断路器
@EnableCircuitBreaker
```

- FeignApi 添加注解
```
@FeignClient(value = "eureka-producer", contextId = "hello", fallback = HelloFeignHystrix.class)
```

- Hystrix 添加注解
```
@Component
```

- yml 配置
```
feign:
  hystrix:
    enabled: true
```