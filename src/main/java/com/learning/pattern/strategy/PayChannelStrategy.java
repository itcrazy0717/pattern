package com.learning.pattern.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: dengxin.chen
 * @date: 2019-11-01 21:07
 * @description: 策略调度管理
 */
public class PayChannelStrategy {

    private PayChannelStrategy() {}

    private static Map<Integer, AbstractPayChannel> channelMap = new ConcurrentHashMap<>();

    static {
        channelMap.put(PayChannel.ALI_CHANNEL.getCode(), new AliPay());
        channelMap.put(PayChannel.WECHAT_CHANNEL.getCode(), new WechatPay());
        channelMap.put(PayChannel.JD_CHANNEL.getCode(), new JdPay());
    }

    public static AbstractPayChannel get(Integer channelCode) {
        if (!channelMap.containsKey(channelCode)) {
            return channelMap.get(PayChannel.ALI_CHANNEL.getCode());
        }
        return channelMap.get(channelCode);
    }
}
