package com.st.assignment.animal.bird;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.util.MessageUtil;

public class Rooster extends Bird {
	
	private static final Logger logger = LoggerFactory.getLogger(Rooster.class);
	
	private Chicken chicken = new Chicken();
	
	@Override
	public void walk() {
		chicken.walk();
	}
	
	@Override
	public void sing() {
		if(logger.isInfoEnabled()) {
			//logger.info("Cock-a-doodle-doo");	
			logger.info(MessageUtil.getMessage("rooster.sing"));
		}
	}

}
