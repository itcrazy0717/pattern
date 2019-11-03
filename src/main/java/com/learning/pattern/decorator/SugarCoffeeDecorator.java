package com.learning.pattern.decorator;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 15:11
 * @description:具体装饰角色
 */
public class SugarCoffeeDecorator extends BaseCoffeeDecorator {


    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+一块糖";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 1d;
    }
}
