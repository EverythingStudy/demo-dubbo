package com.example.java.interfaceImpl;

import com.java.demoInterface.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Date 2019/12/28 21:23
 * @Author cly
 **/
@Service
public class GreetingServiceImpl implements GreetingService {
    @Value("${dubbo.application.name}")
    private String serviceName;
    @Override
    public String sayHello(String name) {
        return name;
    }
}
