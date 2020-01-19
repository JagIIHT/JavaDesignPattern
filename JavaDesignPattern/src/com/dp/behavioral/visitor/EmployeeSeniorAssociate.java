package com.dp.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSeniorAssociate extends Employee {


	private String userName;
	private int age;
	private List<Employee> employees;

	public EmployeeSeniorAssociate(String name, int age) {
		this.userName = name;
		this.setAge(age);
		employees = new ArrayList<Employee>();
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
	
	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void addEmployees(Employee e) {
		this.employees.add(e);
	}
	
	@Override
	void printReportees() {
		this.employees.forEach(emp -> System.out.println("Reportee Name: " + emp.getUserName() + " and Age: " +emp. getAge()));		
	}
	@Override
	void accept(Visitor v) {
		this.employees.forEach(emp -> {
			emp.accept(v);
		});
		
	}
}
