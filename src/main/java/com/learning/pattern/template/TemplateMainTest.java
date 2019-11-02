package com.learning.pattern.template;

import com.learning.pattern.template.washclothes.TideWashClothes;
import com.learning.pattern.template.washclothes.WashClothes;

/**
 * @author: dengxin.chen
 * @date: 2019-11-02 19:27
 * @description:模板模式主测试类
 */
public class TemplateMainTest {

    public static void main(String[] args) {

        WashClothes washClothes = new TideWashClothes(2);
        washClothes.washClothes();
    }
}
