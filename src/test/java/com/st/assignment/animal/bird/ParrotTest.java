package com.st.assignment.animal.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.domestic.Cat;
import com.st.assignment.animal.domestic.Dog;
import com.st.assignment.phone.Phone;

public class ParrotTest {
	
	
	@Test
	public void testParrotSing() {
		Parrot parrot = new Parrot();
		parrot.sing();
		assertEquals(true, parrot instanceof Singing);		
	}
	
	@Test
	public void testParrotNearDog() {
		Parrot parrot = new Parrot(new Dog());
		parrot.sing();
		assertEquals(true, parrot instanceof Singing);		
	}
	
	@Test
	public void testParrotNearCat() {
		Parrot parrot = new Parrot(new Cat());
		parrot.sing();
		assertEquals(true, parrot instanceof Singing);		
	}
	
	@Test
	public void testParrotNexttoDuck() {
		Parrot parrot = new Parrot(new  Duck());
		parrot.sing();
		assertEquals(true, parrot instanceof Singing);		
	}
	
	@Test
	public void testParrotNearPhone() {
		Parrot parrot = new Parrot(new Phone());
		parrot.sing();
		assertEquals(true, parrot instanceof Singing);		
	}

}
