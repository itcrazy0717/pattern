package com.learning.pattern.prototype.simple;

import java.util.List;

import lombok.Data;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 16:48
 * @description: 通过实现Cloneable接口来实现原型模式
 */
@Data
public class ConcretePrototypeClone implements Cloneable {
    private Integer age;
    private String name;
    private List<String> hobbies;

    public ConcretePrototypeClone cloneSimple() throws CloneNotSupportedException {
        return (ConcretePrototypeClone) super.clone();
    }
}
