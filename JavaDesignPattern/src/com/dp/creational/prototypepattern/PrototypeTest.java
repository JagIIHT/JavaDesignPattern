package com.dp.creational.prototypepattern;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e = new Employee("Jag", "Nest");
		System.out.println(e.toString());

		Employee e2 = (Employee) e.clone();
		e.setName("Jaga");
		System.out.println(e2.toString());
	}

}
