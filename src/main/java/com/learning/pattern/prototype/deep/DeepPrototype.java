package com.learning.pattern.prototype.deep;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 17:10
 * @description: 深克隆 抽象角色
 */
public interface DeepPrototype {

    /**
     * 克隆方法
     *
     * @return
     */
    DeepPrototype clone();
}
