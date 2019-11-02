package com.learning.pattern.adapter.hdmiadapter;

/**
 * @author: dengxin.chen
 * @date: 2019-11-02 20:34
 * @description: 源角色
 */
public class VGA {

    public void showScreen() {
        System.out.println("通过VGA接口进行显示");
        // 由于换了显示器，新的显示器不支持vga显示了，只支持hdmi显示，因此需要一个转接头
    }
}
