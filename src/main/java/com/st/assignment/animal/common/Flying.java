package com.st.assignment.animal.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Flying {
	
	Logger logger = LoggerFactory.getLogger(Flying.class);
	
	default void fly() {
		if(logger.isInfoEnabled())
			logger.info("I am flying");		
	}

}
