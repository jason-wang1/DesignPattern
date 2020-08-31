package org.wangbo.stratege;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月26日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class Duck {
    public Duck(){}

    public abstract void display(); // 显示鸭子信息

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public void fly(){
        System.out.println("鸭子会飞翔");
    }
}
