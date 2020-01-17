package com.example.service;

import com.example.dao.ReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Date 2020/1/16 14:18
 * @Author cly
 **/
@Service
public class ReportServiceImpl implements reportService {
    @Autowired
    ReportMapper reportMapper;

    @Override
    public int del(int id) {
        int count=reportMapper.deleteByPrimaryKey(id);
        System.out.println("=="+count);
        return count;
    }
}
