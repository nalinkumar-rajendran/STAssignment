package com.st.assignment.animal.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Singing {

	Logger logger = LoggerFactory.getLogger(Singing.class);
	
	default void sing() {
		if(logger.isInfoEnabled())
			logger.info("I am singing");		
	}
	
}
