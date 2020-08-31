package org.wangbo.stratege.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月26日
 *
 * @author WangBo
 * @version 1.0
 */
public class WildDuck extends Duck {

    // 构造器，传入FlyBehavior的对象
    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
