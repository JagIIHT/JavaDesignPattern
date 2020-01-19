package com.dp.creational.builder.StringBuilder;

public class SB {

	private String value = "";
	private String prefix = "";
	private String suffix = "";
	private String seperator = "";
	private boolean first = true;

	public static SB getInstance() {
		return new SB();
	}
	
	public static SB getInstance(String prefix, String seperator, String suffix) {
		return new SB(prefix, seperator, suffix);
	}

	private SB(String prefix, String seperator, String suffix) {
		this.prefix = prefix;
		this.seperator = seperator;
		this.suffix = suffix;
	}

	private SB() {}

	public SB add(String s) {
		if(this.first) {
			this.value = this.value + s;
		} else {
			this.value = this.value +this.seperator + s;
		}
		this.first = false;
		return this;
	}

	@Override
	public String toString() {
		return this.prefix + this.value + this.suffix;
	}
}
