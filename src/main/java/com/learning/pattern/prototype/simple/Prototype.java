package com.learning.pattern.prototype.simple;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 16:11
 * @description:原型模式的抽象角色
 */
public interface Prototype {

    /**
     * clone方法
     *
     * @return
     */
    Prototype clone();
}
