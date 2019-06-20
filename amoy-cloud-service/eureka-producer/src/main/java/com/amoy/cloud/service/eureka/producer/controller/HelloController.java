package com.amoy.cloud.service.eureka.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: hjc
 * @create: 2019-06-20
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/")
    public String hello(@RequestParam String name){

        return "Hello," + name + new Date();
    }
}
