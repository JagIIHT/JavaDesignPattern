package com.dp.behavioral.chainofresponsibility;

public class InfoLogger extends Logger{
	private Logger logger;
	
	@Override
	void log(String log) {
		System.out.println("INFO: " + log);
		this.logger.log(log);
		
	}

	@Override
	void setLevel(Logger l) {
		this.logger = l;
		
	}

}
