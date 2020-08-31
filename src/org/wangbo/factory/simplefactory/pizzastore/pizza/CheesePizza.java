package org.wangbo.factory.simplefactory.pizzastore.pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
    }

    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
