package com.learning.pattern.proxy.dynamicproxy;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 22:46
 * @description:代理创建接口
 */
public interface ProxyCreator {

    /**
     * 获得代理
     *
     * @return
     */
    Object getProxy();
}
