package com.dp.behavioral.chainofresponsibility;

public class LoggerFactory {

	public static Logger getLogger(String level) {
		Logger logger;
		if(level.equalsIgnoreCase("INFO")) {
			logger = new InfoLogger();
			logger.setLevel(new DebugLogger());
		} else {
			logger = new DebugLogger();
		}
		return logger;
	}
}
