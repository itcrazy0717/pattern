package com.learning.pattern.decorator;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 15:14
 * @description:
 */
public class MilkCoffeeDecorator extends BaseCoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+一杯牛奶";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 2d;
    }
}
