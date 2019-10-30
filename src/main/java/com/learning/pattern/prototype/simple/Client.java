package com.learning.pattern.prototype.simple;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 16:20
 * @description:client角色 提出创建对象
 */
public class Client {

    public static Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }

    public static ConcretePrototypeClone cloneSimple(ConcretePrototypeClone prototypeClone) throws CloneNotSupportedException {
        return prototypeClone.cloneSimple();
    }
}
