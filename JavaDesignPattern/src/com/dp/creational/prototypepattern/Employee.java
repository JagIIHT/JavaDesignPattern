package com.dp.creational.prototypepattern;

public class Employee implements Cloneable {

	private String name;
	private String office;

	public Employee(String n, String o) {
		this.name = n;
		this.office = o;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " Office - " + this.office;
	}
}
