package com.dp.structural.composite;

public class EmployeeAssociate extends Employee {

	private String userName;
	private int age;

	public EmployeeAssociate(String name, int age) {
		this.userName = name;
		this.setAge(age);
	}
	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	void printReportees() {
		System.out.println("No reportees");
		
	}
}
