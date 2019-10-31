package com.learning.pattern.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;

import com.learning.pattern.proxy.dynamicproxy.ProxyCreator;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author: dengxin.chen
 * @date: 2019-10-31 15:58
 * @description:
 */
public class DiDiProxyCglib implements ProxyCreator, MethodInterceptor {

    private Object target;

    public DiDiProxyCglib(Object target) {
        this.target = target;
    }

    @Override
    public Object getProxy() {
        Class<?> clazz = target.getClass();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object instance = methodProxy.invokeSuper(object, args);
        after();
        return instance;
    }

    private void before() {
        System.out.println("这里是滴滴打车，排队等待。。。。。");
    }

    private void after() {
        System.out.println("车正赶来");
    }
}
