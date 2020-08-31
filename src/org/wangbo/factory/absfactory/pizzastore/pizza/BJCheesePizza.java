package org.wangbo.factory.absfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京奶酪pizza");
		System.out.println("给北京奶酪pizza准备原材料");
	}

}
