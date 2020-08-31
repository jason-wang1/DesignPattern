package org.wangbo.priciple.sigleresponsibility;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class SingleResponsibility3 {
    public static void main(String args[]){
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

// 这种修改方法没有对原来的类做大的修改，只是增加了方法
// 这里虽然没有在类级别上遵守单一职责原则，但是在方法级别上遵守单一职责原则
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空运行");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中运行");
    }
}