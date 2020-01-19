package com.dp.structural.bridge;

public class Honda150CC extends HondaBike{

	public Honda150CC(StarterKit sk) {
		super(sk);
	}
	
	@Override
	boolean run() {
		boolean flag = super.run();
		System.out.println("Ready to ride 150CC");
		return flag;
	}
}
