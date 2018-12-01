package com.st.assignment.animal.fish;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.common.Color;
import com.st.assignment.animal.common.Color.ColorEnum;
import com.st.assignment.animal.common.Eating;
import com.st.assignment.animal.common.Eating.EatingMenu;
import com.st.assignment.animal.common.Shape;
import com.st.assignment.animal.common.Shape.ShapeSize;
import com.st.assignment.animal.common.Swimming;

public class SharkTest {
	
	Shark shark = null;
	
	@Before
	public void init() {
		shark = new Shark.SharkCreator(ColorEnum.GREY, ShapeSize.LARGE).setEatingMenu(EatingMenu.FISH).create();
	}
	
	@Test
	public void testSwim() {
		shark.swim();
		assertEquals(true, shark instanceof Swimming);		
	}
	
	@Test
	public void testColor() {
		shark.color();
		assertEquals(true, shark instanceof Color);		
	}
	
	@Test
	public void testShape() {
		shark.shape();
		assertEquals(true, shark instanceof Shape);		
	}
	
	@Test
	public void testEat() {
		shark.eat();
		assertEquals(true, shark instanceof Eating);		
	}
		
	@After
	public void destroy() {
		shark = null;
	}

}
