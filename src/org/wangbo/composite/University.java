package org.wangbo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月01日
 *
 * @author WangBo
 * @version 1.0
 */

// University就是composite，可以管理College
public class University extends OrgComponent {
    List<OrgComponent> orgComponents = new ArrayList<OrgComponent>();

    // 构造器
    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void add(OrgComponent orgComponent) {
        orgComponents.add(orgComponent);
    }

    @Override
    protected void remove(OrgComponent orgComponent) {
        orgComponents.remove(orgComponent);
    }

    // print方法，就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("--------"+getName()+"--------");
        for (OrgComponent orgComponent : orgComponents) {
            orgComponent.print();
        }
    }

}
