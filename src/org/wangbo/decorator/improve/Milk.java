package org.wangbo.decorator.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDesc("牛奶");
        setPrice(2.0f);
    }
}
