package com.dp.structural.bridge;

public class HondaBike extends Vehicle {
	
	public HondaBike(StarterKit starterKit) {
		super(starterKit);
	}

	@Override
	boolean initialCheckup() {
		System.out.println("Initial checkup completed - checked for Oil, Air, Honda Specific check etc.,");
		return false;
	}

	@Override
	boolean run() {
		super.run();
		System.out.println("Started and running Honda");
		return true;
	}

}
