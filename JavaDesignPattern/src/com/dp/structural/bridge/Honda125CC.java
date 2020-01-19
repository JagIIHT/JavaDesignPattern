package com.dp.structural.bridge;

public class Honda125CC extends HondaBike{

	public Honda125CC(StarterKit sk) {
		super(sk);
	}
	
	@Override
	boolean run() {
		boolean flag = super.run();
		System.out.println("Ready to ride 125CC");
		return flag;
	}
}
