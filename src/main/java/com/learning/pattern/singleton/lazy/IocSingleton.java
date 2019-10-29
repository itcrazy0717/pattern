package com.learning.pattern.singleton.lazy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 14:58
 * @description: spring中的单例 类似ioc中的做法
 */
public class IocSingleton {

    private static Map<String, Object> map = new ConcurrentHashMap<>();

    private IocSingleton() {}

    public static Object getInstance(String className) {
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object instance = null;
                try {
                    instance = Class.forName(className).newInstance();
                    map.put(className, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return instance;
            }
            return map.get(className);
        }

    }


}
