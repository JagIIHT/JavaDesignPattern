package com.dp.creational.singleton;

public class SingletonClass {

	public static SingletonClass instance = new SingletonClass();
	private String text;
	
	private SingletonClass() {
		
	}

	public String getText() {
		return this.text;
	}

	public void setText(String s) {
		this.text = s;
	}
}
