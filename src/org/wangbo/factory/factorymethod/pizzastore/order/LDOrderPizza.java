package org.wangbo.factory.factorymethod.pizzastore.order;

import org.wangbo.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import org.wangbo.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import org.wangbo.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月21日
 *
 * @author WangBo
 * @version 1.0
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
