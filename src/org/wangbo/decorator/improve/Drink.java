package org.wangbo.decorator.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class Drink {
    public String desc; // 描述
    private float price = 0.0f;

    // 计算费用的抽象方法
    // 子类来实现
    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
