package org.wangbo.factory.simplefactory.pizzastore.order;

/**
 * Descreption: 相当于是客户端，发出订购任务
 * Date: 2020年08月21日
 *
 * @author WangBo
 * @version 1.0
 */
public class PizzaStore {
    public static void main(String args[]){
//        new OrderPizza(new SimpleFactory());
        new OrderPizza2();
        System.out.println("退出程序");
    }
}
