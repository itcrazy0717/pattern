package com.learning.pattern.decorator;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 15:07
 * @description:这里以制作咖啡为例 抽象构件角色
 */
public abstract class Coffee {

    /**
     * 获取咖啡的信息
     *
     * @return
     */
    abstract String getMsg();

    /**
     * 获取咖啡的价格
     *
     * @return
     */
    abstract Double getPrice();
}
