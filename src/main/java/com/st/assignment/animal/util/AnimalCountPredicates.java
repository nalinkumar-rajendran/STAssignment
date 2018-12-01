package com.st.assignment.animal.util;

import java.util.function.Predicate;

import com.st.assignment.animal.Animal;
import com.st.assignment.animal.common.Flying;
import com.st.assignment.animal.common.NonFlyingBird;
import com.st.assignment.animal.common.NonWalking;
import com.st.assignment.animal.common.Singing;
import com.st.assignment.animal.common.Swimming;
import com.st.assignment.animal.common.Walking;

public interface AnimalCountPredicates {
	
	Predicate<Animal> FLYING_ANIMAL = (animal -> (animal instanceof Flying
											&& !(animal instanceof NonFlyingBird)));
	Predicate<Animal> WALKING_ANIMAL = (animal -> animal instanceof Walking
											&& !(animal instanceof NonWalking));
	Predicate<Animal> SINGING_ANIMAL = (animal -> animal instanceof Singing);
	Predicate<Animal> SWIMMING_ANIMAL = (animal -> animal instanceof Swimming);


}
