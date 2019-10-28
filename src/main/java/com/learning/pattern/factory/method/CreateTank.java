package com.learning.pattern.factory.method;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:53
 * @description: 抽象工厂
 */
public interface CreateTank {

    /**
     * 获取坦克方法
     *
     * @return
     */
    Tank getTank();
}
