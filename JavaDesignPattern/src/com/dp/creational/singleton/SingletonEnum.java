package com.dp.creational.singleton;

public enum SingletonEnum {

	INSTANCE("instance");
	public String value;

	SingletonEnum(String v) {
		this.value = v;
	}

	public void setValue(String text) {
		this.value = text;
	}

	public String getValue() {
		return this.value;
	}
}
