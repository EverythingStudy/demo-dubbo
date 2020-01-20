package com.example.service;


import com.example.bean.User;
import com.example.dao.ReportMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @Description
 * @Date 2020/1/19 14:05
 * @Author cly
 **/

@Service(version = "1.0.0", interfaceClass = reportService.class)
public class ReportServiceImpl implements reportService {
    private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    @Autowired
    ReportMapper reportMapper;

    @Override
    public int del(int id) {
        int cout = reportMapper.deleteByPrimaryKey(id);
        System.out.println(cout);
        return cout;
    }

    @Override
    public User get() {
        User user = new User();
        user.setName("陈林亚");
        user.setPhone("18601268581");
        user.setAddress("保定市");
        return user;
    }
}
