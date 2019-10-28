package com.learning.pattern.factory.method;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:56
 * @description:
 */
public class GermanyTank implements Tank {

    @Override
    public void run() {
        System.out.println("德国豹坦克");
    }
}
