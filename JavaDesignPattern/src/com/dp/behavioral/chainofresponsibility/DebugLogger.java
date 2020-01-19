package com.dp.behavioral.chainofresponsibility;

public class DebugLogger extends Logger {

	@Override
	void log(String log) {
		System.out.println("DEBUG: " + log);
		
	}

	@Override
	void setLevel(Logger l) {
	}

}
