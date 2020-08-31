package org.wangbo.priciple.sigleresponsibility;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class SingleResponsibility1 {
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

// 交通工具类
// 方式1：run方法违反了单一职责原则
// 解决方案很简单，根据交通工具运行方式不同，分成多个类
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}
