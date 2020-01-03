package com.example.dubbo_customer;

import com.java.demoInterface.GreetingService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DubboCustomerApplication {
    @Reference
    private GreetingService greetingService;
    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(){
        int count = 0;
        while (true) {
            System.out.println(greetingService.sayHello("World "));
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            if (count == 100) {
                break;
            }
        }
        return s -> {
            System.out.println(greetingService.sayHello("World"));
        };
    }
}
