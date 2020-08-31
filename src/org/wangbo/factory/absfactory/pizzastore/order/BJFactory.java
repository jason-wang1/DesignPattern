package org.wangbo.factory.absfactory.pizzastore.order;

import org.wangbo.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import org.wangbo.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import org.wangbo.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
