package org.wangbo.priciple.sigleresponsibility;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class SingleResponsibility2 {
    public static void main(String args[]){
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

// 方案二遵守单一职责原则，但是改动很大，即将类分解，同时修改客户端

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "公路运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "天空运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "水中运行");
    }
}
