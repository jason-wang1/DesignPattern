package org.wangbo.factory.simplefactory.pizzastore.pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public class PepperPizza extends Pizza {
    public PepperPizza() {
    }

    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}