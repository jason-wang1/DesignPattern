package org.wangbo.factory.factorymethod.pizzastore.order;

import org.wangbo.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import org.wangbo.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import org.wangbo.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月21日
 *
 * @author WangBo
 * @version 1.0
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
