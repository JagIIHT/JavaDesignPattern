package com.dp.structural.bridge;

public class TestBridgePattern {

	public static void main(String[] args) {
		System.out.println("**************************** Honda 125CC Shine with Kick starter *************************************************");
		HondaBike shineModalWithKick = new Honda125CC(new KickStarterKit());
		shineModalWithKick.initialCheckup();
		shineModalWithKick.run();
		
		System.out.println("******************************  Honda 125CC Shine with Self starter ***********************************************");
		
		HondaBike shineModalWithSelf = new Honda125CC(new SelfStarterKit());
		shineModalWithSelf.initialCheckup();
		shineModalWithSelf.run();

		System.out.println("**************************** Honda 150CC Unicorn with Self starter *************************************************");
		
		HondaBike unicornWithSelf = new Honda150CC(new SelfStarterKit());
		unicornWithSelf.initialCheckup();
		unicornWithSelf.run();
	}

}
