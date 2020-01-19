package com.dp.structural.bridge;

public class SelfStarterKit implements StarterKit {

	@Override
	public boolean ignite() {
		System.out.println("Ignited by Self starter button");
		return true;
	}

}
