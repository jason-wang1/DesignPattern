package org.wangbo.factory.simplefactory.pizzastore.order;


import org.wangbo.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月21日
 *
 * @author WangBo
 * @version 1.0
 */
public class OrderPizza {
    // 构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊pizza");
//            } else if (orderType.equals("cheese")){
//                pizza = new ChessPizza();
//                pizza.setName("奶酪pizza");
//            } else if (orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒pizza");
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    Pizza pizza = null;
    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory; // 设置简单工厂对象
        do {
            orderType = getType();
            this.pizza = simpleFactory.createPizza(orderType);

            // 输出pizza的信息
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购pizza失败");
                break;
            }
        }while (true);
    }

    // 构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    // 写一个方法，可以获取客户希望订购的pizza种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
