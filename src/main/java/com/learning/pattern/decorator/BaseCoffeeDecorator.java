package com.learning.pattern.decorator;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 15:24
 * @description:装饰角色
 */
public abstract class BaseCoffeeDecorator extends BaseCoffee {

    // 静态代理
    private Coffee coffee;

    public BaseCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getMsg() {
        return this.coffee.getMsg();
    }

    @Override
    public Double getPrice() {
        return this.coffee.getPrice();
    }
}
