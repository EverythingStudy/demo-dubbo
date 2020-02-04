package com.example;

import com.example.configuration.DubboConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Description
 * @Date 2020/1/27 20:02
 * @Author cly
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
        System.in.read();
    }
}
