package org.wangbo.stratege.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月26日
 *
 * @author WangBo
 * @version 1.0
 */

// 策略接口的一种具体实现
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞翔");
    }
}
