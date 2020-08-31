package org.wangbo.builder.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月28日
 *
 * @author WangBo
 * @version 1.0
 */

// 抽象建造者
public abstract class HouseBuilder {
    House house = new House();

    // 将建造房子的流程写好
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();

    // 建造房子，将产品（房子）返回
    public House buildHouse(){
        return house;
    }
}
