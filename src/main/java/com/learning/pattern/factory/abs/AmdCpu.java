package com.learning.pattern.factory.abs;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 17:16
 * @description: 具体产品
 */
public class AmdCpu implements Cpu {

    @Override
    public void createCpu() {
        System.out.println("AMD CPU");
    }
}
