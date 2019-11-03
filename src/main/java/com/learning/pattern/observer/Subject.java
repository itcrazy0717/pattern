package com.learning.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 16:57
 * @description: 抽象主题角色
 */
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
        System.out.println("注册一个观察者");
    }

    /**
     * 删除一个观察者
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
        System.out.println("删除一个观察者");
    }

    /**
     * 通知所有注册的观察者
     *
     * @param newState
     */
    protected void notifyObservers(String newState) {
        for (Observer observer : observerList) {
            observer.update(newState);
        }
    }

}
