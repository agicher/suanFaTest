package com.mode.Proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class jdkProxy {
    private Object target;

    public jdkProxy(Object target){
        this.target = target;
    }


    public Object getInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("开始代理");

                        Object invoke = method.invoke(target,args);

                        System.out.println("结束");
                        return invoke;
                    }
                });
    }
}
