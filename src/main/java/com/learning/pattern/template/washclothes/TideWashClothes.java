package com.learning.pattern.template.washclothes;

/**
 * @author: dengxin.chen
 * @date: 2019-11-02 19:24
 * @description:
 */
public class TideWashClothes extends WashClothes {

    private Integer kindFlag;

    public TideWashClothes(Integer kindFlag) {
        this.kindFlag = kindFlag;
    }

    @Override
    protected Integer selectKindFlag() {
        return this.kindFlag;
    }

    @Override
    public void startWashingMachine(Integer kindFlag) {
        if (kindFlag == 1) {
            System.out.println("使用汰渍洗衣液");
        } else {
            System.out.println("使用汰渍洗衣粉");
        }
    }
}
