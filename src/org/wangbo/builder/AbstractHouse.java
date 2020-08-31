package org.wangbo.builder;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月28日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class AbstractHouse {
    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();;
        roofed();
    }
}
