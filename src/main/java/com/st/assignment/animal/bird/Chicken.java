package com.st.assignment.animal.bird;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.common.NonFlyingBird;

public class Chicken extends Bird implements NonFlyingBird {
	
	private static final Logger logger = LoggerFactory.getLogger(Chicken.class);
	
	@Override
	public void sing() {
		if(logger.isInfoEnabled())
			logger.info("Cluck, cluck");	
	}
	
	@Override
	public void fly() {
		throw new RuntimeException("Can not fly");	
	}

}
