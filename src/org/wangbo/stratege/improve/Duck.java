package org.wangbo.stratege.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月26日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class Duck {
    // 属性，策略接口
    FlyBehavior flyBehavior;
    // 其他属性，策略接口

    public Duck(){}

    public abstract void display(); // 显示鸭子信息

    public void fly(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
