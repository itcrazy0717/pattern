package com.learning.pattern.template.washclothes;

/**
 * @author: dengxin.chen
 * @date: 2019-11-02 12:48
 * @description:抽象模板角色
 */
public abstract class WashClothes {

    /**
     * 这里以洗衣服为例，模拟模板模式
     * 第一步：将衣服收集
     * 第二步：将衣服放入洗衣机
     * 第三步：启动洗衣机
     * 第四步：衣服洗好后晾晒
     */

    public void washClothes() {
        this.collectClothes();

        this.putInWashingMachine();

        this.startWashingMachine(selectKindFlag());

        this.dryClothes();
    }

    final void dryClothes() {
        System.out.println("晾衣服");
    }

    /**
     * 选择不同洗衣产品
     *
     * @return
     */
    protected abstract Integer selectKindFlag();

    /**
     * 此步骤为钩子方法，启动洗衣机时，可放入不同的洗衣粉或者洗衣液
     *
     * @param kindFlag 1-洗衣液 2-洗衣粉
     */
    public abstract void startWashingMachine(Integer kindFlag);

    /**
     * 此步骤也不允许修改，将洗衣服放入洗衣机
     */
    final void putInWashingMachine() {
        System.out.println("将衣服放入洗衣机");
    }

    /**
     * 收集衣服，此步骤不允许外部修改，所以用final进行修饰
     */
    final void collectClothes() {
        System.out.println("将需要清洗的衣服收集起来");
    }

}
