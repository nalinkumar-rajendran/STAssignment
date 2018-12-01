package com.st.assignment.animal.bird;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck extends Bird {
	
	private static final Logger logger = LoggerFactory.getLogger(Duck.class);
	
	@Override
	public void sing() {
		if(logger.isInfoEnabled())
			logger.info("Quack, quack");	
	}

}
