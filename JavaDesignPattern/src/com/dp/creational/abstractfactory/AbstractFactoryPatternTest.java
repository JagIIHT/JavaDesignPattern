package com.dp.creational.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {
		System.out.println("Please enter type needed Bank or Card - ");
		Scanner sc = new Scanner(System.in);
		
		String type = sc.nextLine();
		
		ParentFactory pf = new ParentFactory();
		TypeFactory tf = pf.getFactory(type);
		
		if (type != null && type.equalsIgnoreCase("Bank")) {
			System.out.println("Please enter type of Bank (SBI, HDFC) - ");
			type = sc.nextLine();
			Bank b = tf.getBank(type);
			System.out.println("Bank name - " + b.getBankName());
		} else if (type != null && type.equalsIgnoreCase("Card")) {
			System.out.println("Please enter type of Card (Credit, Debit) - ");
			type = sc.nextLine();
			Card c = tf.getCard(type);
			System.out.println("Card type - " + c.cardType());
		}
	}

}
