package com.sp.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
	
	private static final Logger LOG = LogManager.getLogger(Log4jExample.class);

	public static void main(String[] args) {
		//System.out.println(LOG.getName());
		//System.out.println(LOG.getLevel());
		LOG.debug("This Will Be Printed On Debug");
		LOG.info("This Will Be Printed On Info");
		LOG.warn("This Will Be Printed On Warn");
		LOG.error("This Will Be Printed On Error");
		LOG.fatal("This Will Be Printed On Fatal");

		LOG.info("Appending string: {}.", "Hello, World");

	}

}
