package org.wangbo.factory.simplefactory.pizzastore.pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public class GreekPizza extends Pizza {
    public GreekPizza() {
    }

    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
