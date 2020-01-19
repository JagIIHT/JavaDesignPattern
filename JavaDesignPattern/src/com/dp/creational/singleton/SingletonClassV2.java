package com.dp.creational.singleton;

public class SingletonClassV2 {

	public static SingletonClassV2 instance;
	private String text;

	private SingletonClassV2() {
	}

	public static SingletonClassV2 getInstance() {
		if (instance == null) {
			instance = new SingletonClassV2();
		}
		return instance;
	}

	public String getString() {
		return this.text;
	}

	public void setString(String s) {
		this.text = s;
	}
}
