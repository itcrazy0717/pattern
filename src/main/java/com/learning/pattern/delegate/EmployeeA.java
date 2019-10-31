package com.learning.pattern.delegate;

/**
 * @author: dengxin.chen
 * @date: 2019-10-31 18:29
 * @description: 具体任务角色
 */
public class EmployeeA implements Employee {

    @Override
    public void doing(String command) {
        System.out.println("我是前端，主要负责前端工作,执行" + command + "工作");
    }
}
