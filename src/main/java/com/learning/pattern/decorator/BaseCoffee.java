package com.learning.pattern.decorator;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 15:09
 * @description:具体构件角色 什么都不加的咖啡 最基础的
 */
public class BaseCoffee extends Coffee {

    @Override
    public String getMsg() {
        return "纯咖啡";
    }

    @Override
    public Double getPrice() {
        return 1d;
    }
}
