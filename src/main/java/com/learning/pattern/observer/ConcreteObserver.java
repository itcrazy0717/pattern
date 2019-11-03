package com.learning.pattern.observer;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 16:56
 * @description:
 */
public class ConcreteObserver implements Observer {

    /**
     * 观察者名称
     */
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println("观察者" + name + " 状态发生改变：" + state);
    }
}
