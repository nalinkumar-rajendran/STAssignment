package com.st.assignment.animal.helper;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

import com.st.assignment.animal.Animal;
import com.st.assignment.animal.util.AnimalCountPredicates;

public class CountingHelper {
	
	public enum AnimalType {
		FLAYING(AnimalCountPredicates.FLYING_ANIMAL), 
		WALKING(AnimalCountPredicates.WALKING_ANIMAL), 
		SINGING(AnimalCountPredicates.SINGING_ANIMAL), 
		SWIMMING(AnimalCountPredicates.SWIMMING_ANIMAL);
	
		private Predicate<Animal> animalPredicate;		
		private AnimalType(Predicate<Animal> animalPredicate) {
			this.animalPredicate = animalPredicate;
		}
		
		private Predicate<Animal> getAnimalPredicate() {
			return this.animalPredicate;
		}
	}
		
	private Map<AnimalType, Integer> animalCountsMap;
				
	public CountingHelper() {
		animalCountsMap = new ConcurrentHashMap<>(AnimalType.values().length);
		Arrays.stream(AnimalType.values())
	 	  .forEach(animalType -> animalCountsMap.put(animalType, new Integer(0)));	
	}
		
	public void addAnimalCountStream(Animal animal) {		
		Arrays.stream(AnimalType.values())
			  .filter(animalType -> animalType.getAnimalPredicate().test(animal))
			  .forEach(animalType -> animalCountsMap.put(animalType, 
					  					animalCountsMap.get(animalType) + 1));
		
	}
		
	public Map<AnimalType, Integer> getAnimalCountsMap() {
		return animalCountsMap;
	}

	public Integer getAnimalCountsByType(AnimalType animalType) {
		return animalCountsMap.get(animalType);
	}

}
