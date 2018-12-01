package com.st.assignment.animal.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Walking {
	
	Logger logger = LoggerFactory.getLogger(Walking.class);
	
	default void walk() {
		if(logger.isInfoEnabled())
			logger.info("I am walking");		
	}

}
