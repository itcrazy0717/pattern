package com.learning.pattern.decorator;

import org.junit.jupiter.api.Test;

/**
 * @author: dengxin.chen
 * @date: 2019-11-03 15:15
 * @description:装饰模式主测试类
 */
public class DecoratorMainTest {

    @Test
    public void decoratorTest() {

        Coffee coffee = new BaseCoffee();

        // 加一份糖
        coffee = new SugarCoffeeDecorator(coffee);

        // 加一份牛奶
        coffee = new MilkCoffeeDecorator(coffee);

        // 再加一份牛奶
        coffee = new MilkCoffeeDecorator(coffee);


        System.out.println("咖啡信息：" + coffee.getMsg() + " 价格：" + coffee.getPrice());
    }
}
