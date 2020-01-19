package com.dp.behavioral.chainofresponsibility;

public abstract class Logger {

	abstract void log(String log);
	
	abstract void setLevel(Logger l);
}
