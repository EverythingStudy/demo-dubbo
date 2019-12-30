package com.example.java.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Value("${dubbo.application.name}")
    private String serviceName;
    @Override
    public String getName(String name) {
        return serviceName+name;
    }
}
