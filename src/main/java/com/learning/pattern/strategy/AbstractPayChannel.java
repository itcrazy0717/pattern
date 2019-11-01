package com.learning.pattern.strategy;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 20:54
 * @description: 抽象策略角色 这里以支付渠道为例
 */
public abstract class AbstractPayChannel {

    /**
     * 获取支付渠道名称
     *
     * @return
     */
    abstract String getChanelName();

    /**
     * 通过用户uid查询余额
     *
     * @param uid
     * @return
     */
    abstract Double queryBalance(Long uid);

    public Result pay(Long uid, Double amount) {
        if (queryBalance(uid) < amount) {
            return new Result(500, "支付失败", "余额不足");
        } else {
            return new Result(200, "支付成功", "支付金额" + amount);
        }
    }
}
