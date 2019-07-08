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

```

- yml 配置
```
## 此处配置加在被监控的服务的工程里
## 被监控的服务需开放 hystrix.stream
management:
  endpoints:
    web:
      exposure:
        include: info,hystrix.stream
```

### 访问路径

- [localhost:8100/hystrix](http://localhost:8100/hystrix)