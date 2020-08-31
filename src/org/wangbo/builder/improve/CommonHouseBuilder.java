package org.wangbo.builder.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月28日
 *
 * @author WangBo
 * @version 1.0
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
        house.setBase("5米");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10cm");
        house.setWall("10cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子盖屋顶");
        house.setRoofed("盖屋顶");
    }
}
