package com.learning.pattern.observer;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 17:02
 * @description: 具体主题角色
 */
public class ConcreteSubject extends Subject {

    public void change(String newState) {
        System.out.println("主题状态发生改变");
        this.notifyObservers(newState);
    }
}
