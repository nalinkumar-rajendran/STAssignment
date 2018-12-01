package com.st.assignment.animal.bird;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.common.Singing;

public class Parrot extends Bird {
	
	private static final Logger logger = LoggerFactory.getLogger(Parrot.class);
	
	private Singing singing;
	
	public Parrot() {
		
	}
	
	public Parrot(Singing singing) {
		this.singing = singing;
	}
	
	@Override
	public void sing() {
		if(singing != null) {
			singing.sing();
		}
		else {
			if(logger.isInfoEnabled())
				logger.info("kee kee");
		}
	}

}
