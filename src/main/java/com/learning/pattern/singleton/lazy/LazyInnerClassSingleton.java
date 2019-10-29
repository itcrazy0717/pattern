package com.learning.pattern.singleton.lazy;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 21:53
 * @description:懒汉式内部类形式单例
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {}

    public static LazyInnerClassSingleton getInstance() {
        return HolderInstance.instance;
    }

    private static class HolderInstance {
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
}
