package com.st.assignment.animal.fish;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Color;
import com.st.assignment.animal.common.Color.ColorEnum;
import com.st.assignment.animal.common.Joking;
import com.st.assignment.animal.common.Shape;
import com.st.assignment.animal.common.Shape.ShapeSize;
import com.st.assignment.animal.common.Swimming;

public class ClownfishTest {
	
	Clownfish clownfish = null;
	
	@Before
	public void init() {
		clownfish = new Clownfish.ClownfishCreator(ColorEnum.ORANGE, ShapeSize.SMALL).setJokes(true).create();
	}
	
	@Test
	public void testSwim() {
		clownfish.swim();
		assertEquals(true, clownfish instanceof Swimming);		
	}
	
	@Test
	public void testColor() {
		clownfish.color();
		assertEquals(true, clownfish instanceof Color);		
	}
	
	@Test
	public void testShape() {
		clownfish.shape();
		assertEquals(true, clownfish instanceof Shape);		
	}
	
	@Test
	public void testJokes() {
		clownfish.joke();
		assertEquals(true, clownfish instanceof Joking);		
	}
		
	@After
	public void destroy() {
		clownfish = null;
	}

}
