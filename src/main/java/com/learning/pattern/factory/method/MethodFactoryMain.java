package com.learning.pattern.factory.method;

/**
 * @author: dengxin.chen
 * @date: 2019-10-28 21:50
 * @description:工厂方法主测试类
 */
public class MethodFactoryMain {

    /**
     * 工厂方法模式 将具体创建对象的过程下沉到具体的子类中去
     * 涉及抽象工厂、具体工厂、抽象对象、具体对象四种角色
     *
     * @param args
     */
    public static void main(String[] args) {
//        CreateTank tankFactory = new ChinaTankFactory();
        CreateTank tankFactory = new GermanyTankFactory();
        Tank tank = tankFactory.getTank();
        tank.run();
    }
}
