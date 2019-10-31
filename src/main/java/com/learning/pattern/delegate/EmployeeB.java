package com.learning.pattern.delegate;

/**
 * @author: dengxin.chen
 * @date: 2019-10-31 18:30
 * @description:
 */
public class EmployeeB implements Employee {

    @Override
    public void doing(String command) {
        System.out.println("我是后端，主要负责后端工作,执行" + command + "工作");
    }
}
