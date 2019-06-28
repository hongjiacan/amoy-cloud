# amoy-cloud-eureka-client

### 相关配置

- pom 引用

```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```

- yml 配置
```
spring:
  application:
    name: @pom.artifactId@
server:
  port: 8001

eureka:
  client:
    service-url:
      defaultZone: http://root:root@localhost:8761/eureka/

info:
  app:
    name: @pom.artifactId@
```