package com.learning.pattern.singleton.lazy;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 14:10
 * @description: 使用ThreadLocal的方式实现的单例 但是这种方式在线程内部是线程安全的，在跨线程后就会出现不同的单例，伪线程安全
 */
public class LazyThreadLocalSingleton {

    private static final ThreadLocal<LazyThreadLocalSingleton> instance = ThreadLocal.withInitial(LazyThreadLocalSingleton::new);

    private LazyThreadLocalSingleton() {}

    public static LazyThreadLocalSingleton getInstance() {
        return instance.get();
    }
}
