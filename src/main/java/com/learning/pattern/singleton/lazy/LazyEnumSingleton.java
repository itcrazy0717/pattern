package com.learning.pattern.singleton.lazy;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 11:47
 * @description: 枚举形式的单例 注册式单例
 */
public enum LazyEnumSingleton {

    INSTANCE;

    public static LazyEnumSingleton getInstance() {
        return INSTANCE;
    }
}
