package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.bean.User;

/**
 * @Description
 * @Date 2020/1/27 20:02
 * @Author cly
 **/
@Service(timeout = 5000)
public class ReportServiceImpl implements reportService {
    @Override
    public int del(int id) {
        return 0;
    }

    @Override
    public User get() {
        return null;
    }
}
