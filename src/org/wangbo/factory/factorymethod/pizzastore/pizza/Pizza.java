package org.wangbo.factory.factorymethod.pizzastore.pizza;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月21日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class Pizza {
	protected String name;

	// 准备原材料，不同pizza不一样，因此做成抽象方法
	public abstract void prepare();

	public void bake(){
		System.out.println(name + " bake");
	}

	public void cut(){
		System.out.println(name + " cutting");
	}

	public void box(){
		System.out.println(name + " boxing");
	}

	public void setName(String name){
		this.name = name;
	}

}