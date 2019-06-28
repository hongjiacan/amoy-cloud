# amoy-cloud-eureka

### 相关配置

- pom 引用
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```

- Application 添加注解
```
@EnableEurekaServer
```

- yml 配置
```
server:
  port: 8761

spring:
  application:
    name: @pom.artifactId@

  security:
    user:
      name: root
      password: root

eureka:
  instance:
    hostname: localhost
  client:
    register-with-eureka: false
    fetch-registry: false
    service-url:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
```
