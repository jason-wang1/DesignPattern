package org.wangbo.composite;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月01日
 *
 * @author WangBo
 * @version 1.0
 */
public class Department extends OrgComponent {

    public Department(String name, String desc) {
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

    // add和remove方法不需要再写了，因为它是叶子节点，不需要管理其他节点

    @Override
    protected void print() {
        System.out.println("--------"+getName()+"--------");
    }
}
