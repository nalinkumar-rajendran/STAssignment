package com.st.assignment.phone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.common.Singing;

public class Phone implements Singing {
	
	private static final Logger logger = LoggerFactory.getLogger(Phone.class);
	
	@Override
	public void sing() {
		if(logger.isInfoEnabled())
			logger.info("Ring, ring");	
	}

}
