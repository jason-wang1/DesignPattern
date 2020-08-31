package org.wangbo.factory.absfactory.pizzastore.order;

import org.wangbo.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */

// 抽象工厂模式的抽象层
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
