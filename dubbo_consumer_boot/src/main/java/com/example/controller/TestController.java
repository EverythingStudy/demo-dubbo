package com.example.controller;


import com.example.service.reportService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2020/1/16 15:20
 * @Author cly
 **/
@RestController
public class TestController {
    @Reference(version = "1.0.0")
    private reportService reportService;
    @RequestMapping(value = "test/{id}")
    public void test(@PathVariable(value = "id") int id){
        System.out.println(id);
        int count=reportService.del(id);
        System.out.println("=="+id);
  }
}
