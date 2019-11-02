package com.learning.pattern.adapter.hdmiadapter;

/**
 * @author: dengxin.chen
 * @date: 2019-11-02 20:37
 * @description:
 */
public class HDMI implements HDMIAdapter {

    private VGA vga;

    public HDMI(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void showHdmiScreen() {
        System.out.println("原来是通过vga模式进行显示的");
        this.vga.showScreen();
        System.out.println("通过转接头后，通过HDMI模式进行显示");
    }
}
