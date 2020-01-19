package com.dp.structural.bridge;

public class KickStarterKit implements StarterKit {

	@Override
	public boolean ignite() {
		System.out.println("Ignited by Manual Kicker");
		return true;
	}

}
