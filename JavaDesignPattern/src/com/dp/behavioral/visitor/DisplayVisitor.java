package com.dp.behavioral.visitor;

public class DisplayVisitor extends Visitor {

	@Override
	public void sendAndDisplay(Employee e) {
		System.out.println("Employee details sent and displayed - Visited: " + e.getUserName());
		count++;
	}

	public int getCount() {
		return count;
	}
}
