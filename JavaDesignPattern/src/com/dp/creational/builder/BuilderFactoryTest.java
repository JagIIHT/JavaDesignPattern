package com.dp.creational.builder;

public class BuilderFactoryTest {

	public static void main(String[] args) {
		Pizza p = Pizza.Builder.getInstance().addCheese().addSauce().build();
		System.out.println(p.toString());
	}

}
