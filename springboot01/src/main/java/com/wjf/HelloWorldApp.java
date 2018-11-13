package com.wjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
//说明是springboot应用
public class HelloWorldApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);//spring应用启动起来
    }
}
