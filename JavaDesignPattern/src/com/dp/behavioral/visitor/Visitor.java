package com.dp.behavioral.visitor;

public abstract class Visitor {
	
	int count;
	
	abstract void sendAndDisplay(Employee e);
}
