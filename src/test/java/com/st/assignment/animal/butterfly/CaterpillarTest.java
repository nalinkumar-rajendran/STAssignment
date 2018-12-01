package com.st.assignment.animal.butterfly;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.butterfly.common.ButterflyFactory;
import com.st.assignment.animal.butterfly.common.ButterflyFactory.ButterflyStage;
import com.st.assignment.animal.butterfly.common.ButterflyFamily;
import com.st.assignment.animal.common.Walking;

public class CaterpillarTest {
	
	ButterflyFamily caterpillar = null;
	
	@Before
	public void init() {
		caterpillar = ButterflyFactory.getInstance(ButterflyStage.CATERPILLAR);
	}
	
	@Test
	public void testWalk() {
		caterpillar.walk();
		assertEquals(true, caterpillar instanceof Walking);		
	}
	
	@Test(expected = RuntimeException.class)
	public void testFly() {
		caterpillar.fly();	
	}
	
	@After
	public void destroy() {
		caterpillar = null;
	}

}
