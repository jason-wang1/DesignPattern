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

// College就是composite，可以管理Department
public class College extends OrgComponent {
    List<OrgComponent> orgComponents = new ArrayList<OrgComponent>();

    public College(String name, String desc) {
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
        // 将来实际业务中，College的add方法和University的add方法不一定完全一样
        orgComponents.add(orgComponent);
    }

    @Override
    protected void remove(OrgComponent orgComponent) {
        orgComponents.remove(orgComponent);
    }

    @Override
    protected void print() {
        System.out.println("--------"+getName()+"--------");
        for (OrgComponent orgComponent : orgComponents) {
            orgComponent.print();
        }
    }
}
