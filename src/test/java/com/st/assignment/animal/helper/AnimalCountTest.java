package com.st.assignment.animal.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.st.assignment.animal.Animal;
import com.st.assignment.animal.bird.Bird;
import com.st.assignment.animal.bird.Chicken;
import com.st.assignment.animal.bird.Duck;
import com.st.assignment.animal.bird.Parrot;
import com.st.assignment.animal.bird.Rooster;
import com.st.assignment.animal.butterfly.common.ButterflyFactory;
import com.st.assignment.animal.butterfly.common.ButterflyFactory.ButterflyStage;
import com.st.assignment.animal.common.Flying;
import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.common.Walking;
import com.st.assignment.animal.common.Color.ColorEnum;
import com.st.assignment.animal.common.Eating.EatingMenu;
import com.st.assignment.animal.common.Shape.ShapeSize;
import com.st.assignment.animal.domestic.Cat;
import com.st.assignment.animal.domestic.Dog;
import com.st.assignment.animal.fish.Clownfish;
import com.st.assignment.animal.fish.Fish;
import com.st.assignment.animal.fish.Shark;
import com.st.assignment.animal.helper.CountingHelper.AnimalType;
import com.st.assignment.animal.others.Dolphin;
import com.st.assignment.animal.others.Frog;

public class AnimalCountTest {
	
	Animal[] animals = null;
	CountingHelper helper = null;
	
	@Before
	public void init() {
		animals = new Animal[] {
				new Bird(),         
				new Duck(),         
				new Chicken(),         
				new Rooster(),         
				new Parrot(),         
				new Fish(),         
				new Shark.SharkCreator(ColorEnum.GREY, ShapeSize.LARGE).setEatingMenu(EatingMenu.FISH).create(),         
				new Clownfish.ClownfishCreator(ColorEnum.ORANGE, ShapeSize.SMALL).setJokes(true).create(),           
				new Dolphin(),         
				new Frog(),         
				new Dog(),         
				ButterflyFactory.getInstance(ButterflyStage.BUTTERFLY),         
				new Cat() }; 
		helper = new  CountingHelper();		
		Arrays.stream(animals).forEach(helper::addAnimalCountStream);
	}
	
	@Test
	public void testFlyingAnimalsCount() {
		assertEquals(new Integer(5), helper.getAnimalCountsByType(AnimalType.FLAYING));		
	}
	
	@Test
	public void testWalkingAnimalsCount() {
		assertEquals(new Integer(8), helper.getAnimalCountsByType(AnimalType.WALKING));		
	}
	
	@Test
	public void testSingingAnimalsCount() {
		assertEquals(new Integer(8), helper.getAnimalCountsByType(AnimalType.SINGING));		
	}
	
	@Test
	public void testSwimmingAnimalsCount() {
		assertEquals(new Integer(5), helper.getAnimalCountsByType(AnimalType.SWIMMING));		
	}
	
	@After
	public void destroy() {
		animals = null;
	}

}
