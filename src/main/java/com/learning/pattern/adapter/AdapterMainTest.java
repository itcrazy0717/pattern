package com.learning.pattern.adapter;

import org.junit.jupiter.api.Test;

import com.learning.pattern.adapter.hdmiadapter.HDMI;
import com.learning.pattern.adapter.hdmiadapter.HDMIAdapter;
import com.learning.pattern.adapter.hdmiadapter.VGA;

/**
 * @author: dengxin.chen
 * @date: 2019-11-02 20:39
 * @description:适配器模式主测试类
 */
public class AdapterMainTest {

    /**
     * HDMI适配器测试
     */
    @Test
    public void hdmiAdapterTest() {

        // 将原来的vga线插入转接头
        HDMIAdapter adapter = new HDMI(new VGA());
        adapter.showHdmiScreen();
    }
}
