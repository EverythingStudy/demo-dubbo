package com.example.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Date 2020/1/27 21:15
 * @Author cly
 **/
@Component("annotatedConsumer")
public class ConsumerAnnotationService {
    @Reference
    private reportService reportService;

    public Integer doSayHello(String name) {
        return reportService.del(3);
    }
}
