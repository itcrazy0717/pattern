package com.learning.pattern.factory.method;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:54
 * @description: 具体产品
 */
public class ChinaTank implements Tank {

    @Override
    public void run() {
        System.out.println("中国59");
    }
}
