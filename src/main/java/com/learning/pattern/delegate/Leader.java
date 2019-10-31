package com.learning.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: dengxin.chen
 * @date: 2019-10-31 18:31
 * @description:
 */
public class Leader implements Employee {

    private static Map<String, Employee> register = new HashMap<>();

    static {
        register.put("前端", new EmployeeA());
        register.put("后端", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        register.get(command).doing(command);
    }
}
