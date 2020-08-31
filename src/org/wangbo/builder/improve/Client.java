package org.wangbo.builder.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月28日
 *
 * @author WangBo
 * @version 1.0
 */
public class Client {
    public static void main(String args[]){
        // 盖普通房子
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();

        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);

        // 完成盖房子，返回产品
        House house = houseDirector.constructHouse();

        System.out.println(house);

    }
}
