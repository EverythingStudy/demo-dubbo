package com.example.controller;

import com.example.service.reportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Description
 * @Date 2020/1/15 18:05
 * @Author cly
 **/
@Controller
@RequestMapping("test/")
public class ReportController {

    @Resource
    private reportService reportService;
    @RequestMapping(value = "del/{id}")
    public void del(@PathVariable(value = "id") int id){
        System.out.println("===");
        int count=reportService.del(id);
        System.out.println(count);
    }
}
