package com.learning.pattern.proxy;

import org.junit.jupiter.api.Test;

import com.learning.pattern.proxy.dynamicproxy.cglib.Bike;
import com.learning.pattern.proxy.dynamicproxy.cglib.DiDiProxyCglib;
import com.learning.pattern.proxy.dynamicproxy.jdk.DiDiProxyJdk;
import com.learning.pattern.proxy.staticproxy.StaticProxy;
import com.learning.pattern.proxy.staticproxy.TaxiCar;
import com.learning.pattern.proxy.staticproxy.TruckCar;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 22:04
 * @description:
 */
public class ProxyMainTest {

    /**
     * 静态代理模式 客户端不直接和目标打交道，而是通过代理对象来实现
     */
    @Test
    public void staticProxyTest() {
        TaxiCar taxiCar = new TaxiCar();
        // 如果不用代理则直接使用taxiCar.callCar即可
        TruckCar truckCar = new TruckCar();
//        StaticProxy proxy = new StaticProxy(taxiCar);
        StaticProxy proxy = new StaticProxy(truckCar);
        proxy.callCar();
    }

    /**
     * jdk动态代理测试
     */
    public static void jdkProxyTest() {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        CallCar proxy = (CallCar) new DiDiProxyJdk(new TaxiCar()).getProxy();
        System.out.println(proxy.getClass());
        proxy.callCar();
    }

    /**
     * cglib动态代理 可对接口和类都进行代理
     */
    @Test
    public void cglibProxyTest() {
//        DiDiProxyCglib proxy = new DiDiProxyCglib(new TaxiCar());
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, System.getProperty("user.dir"));
        Bike proxy = (Bike) new DiDiProxyCglib(new Bike()).getProxy();
        System.out.println(proxy.getClass());
        proxy.callCar();
    }

    public static void main(String[] args) {
        // 须在main函数中，才会产生jdk代理产生的代理类文件
        jdkProxyTest();
    }

}
