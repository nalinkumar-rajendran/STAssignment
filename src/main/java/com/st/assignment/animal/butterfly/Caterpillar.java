package com.st.assignment.animal.butterfly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.butterfly.common.ButterflyFamily;
import com.st.assignment.animal.common.NonFlyingBird;

public class Caterpillar implements ButterflyFamily, NonFlyingBird { 
	
	private static final Logger logger = LoggerFactory.getLogger(Caterpillar.class);
	
	
	@Override
	public void fly() {
		throw new RuntimeException("Can not fly");
	}
	
	@Override
	public void walk() {
		if(logger.isInfoEnabled())
			logger.info("I am crawling");	
	}

}
