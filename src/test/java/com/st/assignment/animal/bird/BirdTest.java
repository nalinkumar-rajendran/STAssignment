package com.st.assignment.animal.bird;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Flying;
import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.common.Walking;

public class BirdTest {

	Bird bird = null;
	
	@Before
	public void init() {
		bird = new Bird();
	}
	
	@Test
	public void testWalk() {
		bird.walk();
		assertEquals(true, bird instanceof Walking);		
	}
	
	@Test
	public void testFly() {
		bird.fly();
		assertEquals(true, bird instanceof Flying);		
	}
	
	@Test
	public void testSing() {
		bird.sing();
		assertEquals(true, bird instanceof Singing);		
	}
	
	@After
	public void destroy() {
		bird = null;
	}
	
}
