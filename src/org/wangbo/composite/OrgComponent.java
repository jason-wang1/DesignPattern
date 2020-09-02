package org.wangbo.composite;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月01日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class OrgComponent {
    private String name;
    private String desc;

    protected void add(OrgComponent orgComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrgComponent orgComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 方法print，子类都需要实现
    protected abstract void print();

    public OrgComponent(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
