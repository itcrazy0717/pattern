package com.learning.pattern.prototype.deep;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 17:17
 * @description:深度克隆 客户端角色
 */
public class DeepClient {

    public static DeepPrototype deepClone(DeepPrototype deepPrototype) {
        return deepPrototype.clone();
    }
}
