package com.dp.creational.abstractfactory;

public class ParentFactory {

	public TypeFactory getFactory(String type) {
		if (type == null) {
			return null;
		} else if (type.equals("Card")) {
			return new CardFactory();
		} else if (type.equals("Bank")) {
			return new BankFactory();
		}
		return null;
	}
}
