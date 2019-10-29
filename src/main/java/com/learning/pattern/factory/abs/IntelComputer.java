package com.learning.pattern.factory.abs;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 17:19
 * @description:具体工厂
 */
public class IntelComputer extends AmdCpu implements AbstractComputer {

    @Override
    public void createCpu() {
        Cpu cpu = new IntelCpu();
        cpu.createCpu();
    }

    @Override
    public void createMainBoard() {
        MainBoard mainBoard = new IntelMainBoard();
        mainBoard.createMainBoard();
    }
}
