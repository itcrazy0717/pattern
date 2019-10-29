package com.learning.pattern.factory.abs;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 17:20
 * @description:具体工厂
 */
public class AmdComputer implements AbstractComputer {

    @Override
    public void createCpu() {
        Cpu cpu = new AmdCpu();
        cpu.createCpu();
    }

    @Override
    public void createMainBoard() {
        MainBoard mainBoard = new AmdMainBoard();
        mainBoard.createMainBoard();
    }
}
