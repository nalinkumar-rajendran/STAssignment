package com.st.assignment.animal.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Swimming {
	
	Logger logger = LoggerFactory.getLogger(Swimming.class);
	
	default void swim() {
		if(logger.isInfoEnabled())
			logger.info("I am swimming"); 
	}

}
