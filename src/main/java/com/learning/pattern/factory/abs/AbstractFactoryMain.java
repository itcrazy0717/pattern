package com.learning.pattern.factory.abs;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 17:21
 * @description:抽象工厂主测试类
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {

        AbstractComputer intelComputer = new IntelComputer();
        intelComputer.createCpu();
        intelComputer.createMainBoard();

    }
}
