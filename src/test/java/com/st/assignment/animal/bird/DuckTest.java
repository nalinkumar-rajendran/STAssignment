package com.st.assignment.animal.bird;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Flying;
import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.common.Walking;

public class DuckTest {
	
	Duck duck = null;
	
	@Before
	public void init() {
		duck = new Duck();
	}
	
	@Test
	public void testWalk() {
		duck.walk();
		assertEquals(true, duck instanceof Walking);		
	}
	
	@Test
	public void testFly() {
		duck.fly();
		assertEquals(true, duck instanceof Flying);		
	}
	
	@Test
	public void testSing() {
		duck.sing();
		assertEquals(true, duck instanceof Singing);		
	}
	
	@After
	public void destroy() {
		duck = null;
	}

}
