package org.wangbo.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京胡椒pizza");
		System.out.println("给北京胡椒pizza准备原材料");
	}
}
