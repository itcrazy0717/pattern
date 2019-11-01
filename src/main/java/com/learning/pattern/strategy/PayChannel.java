package com.learning.pattern.strategy;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:10
 * @description:
 */
public enum PayChannel {
    ALI_CHANNEL(1, "支付宝支付"),
    WECHAT_CHANNEL(2, "微信支付"),
    JD_CHANNEL(3, "京东金融");

    private int code;
    private String desc;

    PayChannel(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }
}
