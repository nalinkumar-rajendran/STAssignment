package com.st.assignment.solution;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.Animal;
import com.st.assignment.animal.bird.Bird;
import com.st.assignment.animal.bird.Chicken;
import com.st.assignment.animal.bird.Duck;
import com.st.assignment.animal.bird.Parrot;
import com.st.assignment.animal.bird.Rooster;
import com.st.assignment.animal.butterfly.common.ButterflyFactory;
import com.st.assignment.animal.butterfly.common.ButterflyFactory.ButterflyStage;
import com.st.assignment.animal.common.Color.ColorEnum;
import com.st.assignment.animal.common.Eating.EatingMenu;
import com.st.assignment.animal.common.Shape.ShapeSize;
import com.st.assignment.animal.domestic.Cat;
import com.st.assignment.animal.domestic.Dog;
import com.st.assignment.animal.fish.Clownfish;
import com.st.assignment.animal.fish.Fish;
import com.st.assignment.animal.fish.Shark;
import com.st.assignment.animal.helper.CountingHelper;
import com.st.assignment.animal.helper.CountingHelper.AnimalType;
import com.st.assignment.animal.others.Dolphin;
import com.st.assignment.animal.others.Frog;

public class SolutionE {	
	
	private static final Logger logger = LoggerFactory.getLogger(SolutionE.class);

	public static void main(String[] args) {		
		Animal[] animals = new Animal[] {
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
		
		CountingHelper helper = new  CountingHelper();		
		Arrays.stream(animals).forEach(helper::addAnimalCountStream);
			
		for(AnimalType animalType: helper.getAnimalCountsMap().keySet()) {
			logger.info("No.of {} animals: {}", animalType.name(), helper.getAnimalCountsByType(animalType));
		}
		
	}
	

}
