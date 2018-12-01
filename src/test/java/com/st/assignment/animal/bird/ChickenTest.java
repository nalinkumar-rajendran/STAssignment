package com.st.assignment.animal.bird;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.common.Walking;

public class ChickenTest {
	
	Chicken chicken = null;
	
	@Before
	public void init() {
		chicken = new Chicken();
	}
	
	@Test
	public void testWalk() {
		chicken.walk();
		assertEquals(true, chicken instanceof Walking);		
	}
	
	@Test(expected = RuntimeException.class)
	public void testFly() {
		chicken.fly();
	}
	
	@Test
	public void testSing() {
		chicken.sing();
		assertEquals(true, chicken instanceof Singing);		
	}
	
	@After
	public void destroy() {
		chicken = null;
	}

}
