package com.learning.pattern.observer;

import org.junit.jupiter.api.Test;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 17:01
 * @description:观察者模式主测试类
 */
public class ObserverMainTest {

    @Test
    public void observerTest() {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("观察者1");
        Observer observer2 = new ConcreteObserver("观察者2");
        Observer observer3 = new ConcreteObserver("观察者3");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.change("主题状态发生了改变");

    }
}
