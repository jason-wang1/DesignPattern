package org.wangbo.decorator.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */

// 具体的Decorator，这里是调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDesc("巧克力");
        setPrice(3.0f); // 调味品的价格
    }
}
