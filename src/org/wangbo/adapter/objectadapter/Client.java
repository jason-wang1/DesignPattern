package org.wangbo.adapter.objectadapter;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月23日
 *
 * @author WangBo
 * @version 1.0
 */
public class Client {
    public static void main(String args[]){
        System.out.println("=== 对象适配器模式===");
        Phone phone = new Phone();
        phone.charging(new ValtageAdapter(new Valtage220V()));
    }
}
