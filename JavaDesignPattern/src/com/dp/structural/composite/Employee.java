package com.dp.structural.composite;

public abstract class Employee {

	abstract String getUserName();
	
	abstract int getAge();
	
	void printDetail() {
		System.out.println("Employee Name: " + getUserName() + " and Age: " + getAge());		
	}
	
	abstract void printReportees();
	
	
}
