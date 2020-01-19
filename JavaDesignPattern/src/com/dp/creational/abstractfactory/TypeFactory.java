package com.dp.creational.abstractfactory;

public interface TypeFactory {

	Bank getBank(String name);
	
	Card getCard(String type);
}
