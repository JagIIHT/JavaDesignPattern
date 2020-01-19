package com.dp.creational.abstractfactory;

public class BankFactory implements TypeFactory {

	@Override
	public Bank getBank(String name) {
		if(name == null) {
			return null;
		} else if (name.equals("SBI")) {
			return new SBIBank();
		} else if (name.equals("HDFC")) {
			return new HDFCBank();
		}
		return null;
	}

	@Override
	public Card getCard(String type) {
		return null;
	}

}
