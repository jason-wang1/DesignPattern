package org.wangbo.decorator.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDesc("豆浆");
        setPrice(1.5f);
    }
}
