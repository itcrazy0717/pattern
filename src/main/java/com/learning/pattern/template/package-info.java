/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:55
 * @description:
 */
package com.learning.pattern.template;
/**
 * 模板模式
 * 又叫模板方法模式，指定一个算法的骨架，并允许子类为一个或者多个步骤提供实现
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤
 * 涉及角色：抽象模板角色、具体模板角色
 * 相当于抽象模板角色中抛出一个钩子，子类对钩子进行实现，对流程进行微调，LinkedHashMap就是实现了HashMap中的钩子
 * JdbcTemplate经典的模板方法
 */
