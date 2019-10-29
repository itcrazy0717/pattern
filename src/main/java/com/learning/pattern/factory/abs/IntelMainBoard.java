package com.learning.pattern.factory.abs;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 17:17
 * @description:具体产品
 */
public class IntelMainBoard implements MainBoard {

    @Override
    public void createMainBoard() {
        System.out.println("Intel 主板");
    }
}
