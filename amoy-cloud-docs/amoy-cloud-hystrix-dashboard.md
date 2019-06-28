# amoy-cloud-hystrix-dashboard

### 相关配置

- pom 引用
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
</dependency>
```

- Application 添加注解
```
@EnableHystrixDashboard
@EnableCircuitBreaker
```

- yml 配置
```
management:
  endpoints:
    web:
      exposure:
        include: info,hystrix.stream
```

### 访问路径

- [localhost:8002/hystrix](http://localhost:8002/hystrix)