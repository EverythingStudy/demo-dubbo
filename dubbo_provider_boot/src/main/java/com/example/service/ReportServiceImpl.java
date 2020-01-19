package com.example.service;


import com.example.dao.ReportMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @Description
 * @Date 2020/1/19 14:05
 * @Author cly
 **/

@Service(version = "1.0.0",interfaceClass = reportService.class)
public class ReportServiceImpl implements reportService {
    @Autowired
    ReportMapper reportMapper;
    @Override
    public int del(int id) {
        int cout=reportMapper.deleteByPrimaryKey(id);
        System.out.println(cout);
        return cout;
    }
}
