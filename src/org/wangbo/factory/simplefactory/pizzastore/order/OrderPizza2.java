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
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    // 构造器
    public OrderPizza2() {
        do {
            orderType = getType();
            this.pizza = SimpleFactory.createPizza2(orderType);

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
