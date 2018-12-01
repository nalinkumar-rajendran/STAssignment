package com.st.assignment.animal.bird;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Flying;
import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.common.Walking;

public class RoosterTest {
	
	Rooster rooster = null;
	
	@Before
	public void init() {
		rooster = new Rooster();
	}
	
	@Test
	public void testWalk() {
		rooster.walk();
		assertEquals(true, rooster instanceof Walking);		
	}
	
	@Test
	public void testFly() {
		rooster.fly();
		assertEquals(true, rooster instanceof Flying);		
	}
	
	@Test
	public void testSing() {
		rooster.sing();
		assertEquals(true, rooster instanceof Singing);		
	}
	
	@After
	public void destroy() {
		rooster = null;
	}

}
