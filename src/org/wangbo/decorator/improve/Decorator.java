package org.wangbo.decorator.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice自己的价格 + 被装饰者的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDesc() {
        return super.desc + " " + super.getPrice() + " " + obj.getDesc();
    }
}
