package com.learning.pattern.prototype.simple;

import java.util.List;

import lombok.Data;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 16:12
 * @description: 具体角色A
 */
@Data
public class ConcretePrototype implements Prototype {
    private Integer age;
    private String name;
    private List<String> hobbies;

    @Override
    public Prototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }
}
