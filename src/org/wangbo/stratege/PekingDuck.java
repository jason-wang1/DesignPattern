package org.wangbo.stratege;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月26日
 *
 * @author WangBo
 * @version 1.0
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("北京鸭");
    }


    // 因为北京鸭不能飞翔，所以要重写
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
