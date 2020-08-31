package org.wangbo.decorator.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public class CafeBar {
    public static void main(String args[]){
        // 装饰者模式下订单：两份巧克力，一份牛奶的LongBlack

        // 1. 点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDesc());

        // 2. 加入一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶 费用=" + order.cost());
        System.out.println("order加入一份牛奶 描述=" + order.getDesc());

        // 3. 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶 加入一份巧克力 费用=" + order.cost());
        System.out.println("order加入一份牛奶 加入一份巧克力 描述=" + order.getDesc());

        // 4. 再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶 加入两份巧克力 费用=" + order.cost());
        System.out.println("order加入一份牛奶 加入两份巧克力 描述=" + order.getDesc());


    }
}
