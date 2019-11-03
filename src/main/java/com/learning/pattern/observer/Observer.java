package com.learning.pattern.observer;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 16:54
 * @description:抽象观察者角色
 */
public interface Observer {

    /**
     * 更新方法
     *
     * @param state
     */
    void update(String state);
}
