package org.wangbo.stratege;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月26日
 *
 * @author WangBo
 * @version 1.0
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔");
    }
}
