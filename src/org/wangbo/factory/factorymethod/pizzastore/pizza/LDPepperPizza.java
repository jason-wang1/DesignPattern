package org.wangbo.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦胡椒pizza");
		System.out.println("给伦敦胡椒pizza准备原材料");
	}
}
