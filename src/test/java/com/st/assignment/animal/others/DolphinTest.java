package com.st.assignment.animal.others;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Swimming;

public class DolphinTest {
	
	Dolphin dolphin = null;
	
	@Before
	public void init() {
		dolphin = new Dolphin();
	}
	
	@Test
	public void testSwim() {
		dolphin.swim();
		assertEquals(true, dolphin instanceof Swimming);		
	}
		
	@After
	public void destroy() {
		dolphin = null;
	}

}
