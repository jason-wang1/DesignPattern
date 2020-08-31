package org.wangbo.factory.absfactory.pizzastore.order;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public class PizzaStore {
    public static void main(String args[]){
        new OrderPizza(new BJFactory());
    }
}
