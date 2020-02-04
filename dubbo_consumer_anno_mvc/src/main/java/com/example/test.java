package com.example;

import com.example.configuration.ConsumerConfiguration;
import com.example.service.ConsumerAnnotationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Description
 * @Date 2020/1/27 21:14
 * @Author cly
 **/
public class test {
    public static void main( String[] args ) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start(); // 启动
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        int hello = consumerAnnotationService.doSayHello("annotation"); // 调用方法
        System.out.println("result: " + hello); // 输出结果

    }
}
