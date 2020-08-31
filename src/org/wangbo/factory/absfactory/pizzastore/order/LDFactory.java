package org.wangbo.factory.absfactory.pizzastore.order;

import com.wangbo.factory.absfactory.pizzastore.pizza.*;
import org.wangbo.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import org.wangbo.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import org.wangbo.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}