package com.learning.pattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.learning.pattern.proxy.dynamicproxy.ProxyCreator;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 22:31
 * @description:jdk动态代理
 */
public class DiDiProxyJdk implements ProxyCreator, InvocationHandler {

    private Object target;

    public DiDiProxyJdk(Object target) {
        assert target != null;
        Class<?>[] interfaces = target.getClass().getInterfaces();
        if (interfaces.length == 0) {
            throw new IllegalArgumentException("目标对象必须实现接口");
        }
        this.target = target;
    }

    @Override
    public Object getProxy() {
        Class<?> clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    private void before() {
        System.out.println("这里是滴滴打车，排队等待。。。。。");
    }

    private void after() {
        System.out.println("车正赶来");
    }

}
