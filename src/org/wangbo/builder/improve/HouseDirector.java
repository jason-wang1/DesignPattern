package org.wangbo.builder.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月28日
 *
 * @author WangBo
 * @version 1.0
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    // 构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }


}
