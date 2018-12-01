package com.st.assignment.animal.butterfly;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.butterfly.common.ButterflyFactory;
import com.st.assignment.animal.butterfly.common.ButterflyFactory.ButterflyStage;
import com.st.assignment.animal.butterfly.common.ButterflyFamily;
import com.st.assignment.animal.common.Flying;

public class ButterflyTest {
	
	ButterflyFamily butterfly = null;
	
	@Before
	public void init() {
		butterfly = ButterflyFactory.getInstance(ButterflyStage.BUTTERFLY);
	}
	
	@Test
	public void testFly() {
		butterfly.fly();
		assertEquals(true, butterfly instanceof Flying);		
	}
	
	@Test(expected = RuntimeException.class)
	public void testWalk() {
		butterfly.walk();	
	}
	
	@After
	public void destroy() {
		butterfly = null;
	}

}
