package com.learning.pattern.singleton.lazy;

import java.io.Serializable;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 21:34
 * @description: 懒汉式单例 直接使用synchronized 为了演示序列化破坏单例，这里必须实现Serializable
 */
public class LazySingleSerializable implements Serializable {

    private static LazySingleSerializable instance = null;

    private LazySingleSerializable() {}

    /**
     * 直接在方法上加synchronized当然可以实现单例的安全，但是这种方式对性能影响较大，特别在竞争激烈的情况下，争抢锁
     * 因此使用DoubleCheck的方式
     *
     * @return
     */
    public static synchronized LazySingleSerializable getInstance() {
        if (instance == null) {
            instance = new LazySingleSerializable();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

}
