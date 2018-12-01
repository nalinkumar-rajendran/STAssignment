package com.st.assignment.animal.fish;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Swimming;

public class FishTest {
	
	Fish fish = null;
	
	@Before
	public void init() {
		fish = new Fish();
	}
	
	@Test
	public void testSwim() {
		fish.swim();
		assertEquals(true, fish instanceof Swimming);		
	}
		
	@After
	public void destroy() {
		fish = null;
	}

}
