package org.wangbo.factory.simplefactory.pizzastore.order;

import org.wangbo.factory.simplefactory.pizzastore.pizza.CheesePizza;
import org.wangbo.factory.simplefactory.pizzastore.pizza.GreekPizza;
import org.wangbo.factory.simplefactory.pizzastore.pizza.PepperPizza;
import org.wangbo.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * Descreption: 简单工厂类
 * Date: 2020年08月21日
 *
 * @author WangBo
 * @version 1.0
 */
public class SimpleFactory {

    // 根据orderType，返回对应Pizza对象
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒pizza");
        }

        return pizza;
    }

    // 简单工厂模式也叫静态工厂模式
    // 根据orderType，返回对应Pizza对象
    public static Pizza createPizza2(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒pizza");
        }

        return pizza;
    }
}
