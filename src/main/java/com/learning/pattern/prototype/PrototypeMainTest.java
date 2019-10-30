package com.learning.pattern.prototype;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.learning.pattern.prototype.deep.DeepClient;
import com.learning.pattern.prototype.deep.DeepConcretePrototype;
import com.learning.pattern.prototype.simple.Client;
import com.learning.pattern.prototype.simple.ConcretePrototype;
import com.learning.pattern.prototype.simple.ConcretePrototypeClone;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 16:20
 * @description:原型模式主测试类
 */
public class PrototypeMainTest {

    /**
     * 简单的原型模式，直接新建一个对象返回给调用者（有属性的话进行赋值即可）
     */
    @Test
    public void simplePrototypeTest() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(12);
        prototype.setName("test");
        List<String> hobbies = Arrays.asList("游泳", "跑步");
        prototype.setHobbies(hobbies);
        // 克隆
        ConcretePrototype prototypeClone = (ConcretePrototype) Client.startClone(prototype);
        // prototypeClone.getHobbies().set(0, "篮球");
        // 注意这种操作是不会修改原型的，因为这是重新赋值，如果像上面的操作对于引用型属性来说就会修改原型的值
        prototypeClone.setHobbies(Arrays.asList("游泳", "看书"));
        System.out.println("引用类型地址对比" + (prototype.getHobbies() == prototypeClone.getHobbies()));
        System.out.println("原型的hashCode=" + prototype.hashCode());
        System.out.println("克隆的hashCode=" + prototypeClone.hashCode());
        System.out.println("原型的内容：" + prototype);
        System.out.println("克隆的内容：" + prototypeClone);
    }

    /**
     * 实现Cloneable接口的原型模式
     */
    @Test
    public void simpleCloneTest() throws CloneNotSupportedException {
        ConcretePrototypeClone prototype = new ConcretePrototypeClone();
        prototype.setAge(12);
        prototype.setName("test");
        List<String> hobbies = Arrays.asList("游泳", "跑步");
        prototype.setHobbies(hobbies);

        ConcretePrototypeClone prototypeClone = Client.cloneSimple(prototype);

        prototypeClone.getHobbies().set(0, "篮球");
        System.out.println("原型的hashCode=" + prototype.hashCode());
        System.out.println("克隆的hashCode=" + prototypeClone.hashCode());
        System.out.println("原型的内容：" + prototype);
        System.out.println("克隆的内容：" + prototypeClone);
    }

    /**
     * 原型模式深度克隆测试
     */
    @Test
    public void deepCloneTest() {
        DeepConcretePrototype deepConcretePrototype = new DeepConcretePrototype();
        deepConcretePrototype.setName("test");
        List<String> hobbies = Arrays.asList("游泳", "跑步");
        deepConcretePrototype.setHobbies(hobbies);

        // 克隆
        DeepConcretePrototype deepPrototypeClone = (DeepConcretePrototype) DeepClient.deepClone(deepConcretePrototype);
        // 对引用进行修改
        deepPrototypeClone.getHobbies().set(0, "篮球");
        System.out.println("引用类型地址对比" + (deepConcretePrototype.getHobbies() == deepPrototypeClone.getHobbies()));
        System.out.println("原型的hashCode=" + deepConcretePrototype.hashCode());
        System.out.println("克隆的hashCode=" + deepPrototypeClone.hashCode());
        System.out.println("原型的内容：" + deepConcretePrototype);
        System.out.println("克隆的内容：" + deepPrototypeClone);
    }
}
