package com.example.dubboAnnotation;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.bean.User;
import com.example.service.reportService;

/**
 * @Description
 * @Date 2020/1/27 19:23
 * @Author cly
 **/
@Service(timeout = 5000)
public class AnnoReportServiceImpl implements reportService {
    @Override
    public int del(int id) {
        return 0;
    }

    @Override
    public User get() {
        return null;
    }
}
