package com.learning.pattern.factory.abs;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 17:18
 * @description: 抽象工厂
 */
public interface AbstractComputer {

    /**
     * 生产cpu
     */
    void createCpu();

    /**
     * 生产主板
     */
    void createMainBoard();
}
