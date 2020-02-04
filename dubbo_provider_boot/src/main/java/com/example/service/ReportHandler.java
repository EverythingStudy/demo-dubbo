package com.example.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description 动态代理实现接口
 * @Date 2020/1/26 14:37
 * @Author cly
 **/
public class ReportHandler implements InvocationHandler {

    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;

        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object ret=null;
        System.out.println("===");
        ret= method.invoke(targetObject,args);
        System.out.println("===1");
        return ret;
    }
}
