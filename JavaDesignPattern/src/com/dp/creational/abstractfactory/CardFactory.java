package com.dp.creational.abstractfactory;

public class CardFactory implements TypeFactory {

	@Override
	public Bank getBank(String name) {
		return null;
	}

	@Override
	public Card getCard(String type) {
		if(type == null) {
			return null;
		} else if (type.equals("Credit")) {
			return new CreditCard();
		} else if (type.equals("Debit")) {
			return new DebitCard();
		}
		return null;
	}

}
