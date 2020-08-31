package org.wangbo.factory.simplefactory.pizzastore.pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class Pizza {
    protected String name;

    public Pizza() {
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(this.name + " baking;");
    }

    public void cut() {
        System.out.println(this.name + " cutting;");
    }

    public void box() {
        System.out.println(this.name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
