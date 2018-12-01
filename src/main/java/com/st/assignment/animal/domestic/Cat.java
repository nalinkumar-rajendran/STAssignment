package com.st.assignment.animal.domestic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.Animal;
import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.common.Walking;

public class Cat implements Animal, Walking, Singing {
	
	private static final Logger logger = LoggerFactory.getLogger(Cat.class);
	
	@Override
	public void sing() {
		if(logger.isInfoEnabled())
			logger.info("Meow");	
	}

}
