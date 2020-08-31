package org.wangbo.builder.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月28日
 *
 * @author WangBo
 * @version 1.0
 */
public class HighHouseBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给高楼打地基100米");
    }

    @Override
    public void buildWall() {
        System.out.println("给高楼砌墙20cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼的透明屋顶");
    }
}
