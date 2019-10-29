package com.learning.pattern.singleton.hunger;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 18:07
 * @description:饿汉式单例
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        // 通过此方法来防止通过反射破坏单例
        if (instance != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
