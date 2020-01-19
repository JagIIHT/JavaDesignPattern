package com.dp.structural.bridge;

public abstract class Vehicle {
	
	protected StarterKit starterKit;
	
	public Vehicle(StarterKit starterKit) {
		this.starterKit = starterKit;
	}

	abstract boolean initialCheckup();
	
	boolean run() {
		this.starterKit.ignite();
		return true;
	};
}
