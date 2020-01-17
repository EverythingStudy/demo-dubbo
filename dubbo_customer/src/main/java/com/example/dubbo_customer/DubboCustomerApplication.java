package com.example.dubbo_customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DubboCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerApplication.class, args);
    }


}
