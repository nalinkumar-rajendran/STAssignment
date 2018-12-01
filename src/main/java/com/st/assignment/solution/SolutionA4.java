package com.st.assignment.solution;

import com.st.assignment.animal.bird.Duck;
import com.st.assignment.animal.bird.Parrot;
import com.st.assignment.animal.bird.Rooster;
import com.st.assignment.animal.domestic.Cat;
import com.st.assignment.animal.domestic.Dog;
import com.st.assignment.phone.Phone;

public class SolutionA4 {
	
	public static void main(String[] args) {
		Parrot parrot = new Parrot(); 		
		parrot.walk();         
		parrot.fly();         
		parrot.sing();     
		
		Parrot parrot1 = new Parrot(new Dog()); 		
		parrot1.walk();         
		parrot1.fly();         
		parrot1.sing();
		
		Parrot parrot2 = new Parrot(new Cat()); 		
		parrot2.walk();         
		parrot2.fly();         
		parrot2.sing();
		
		Parrot parrot3 = new Parrot(new Duck()); 		
		parrot3.walk();         
		parrot3.fly();         
		parrot3.sing();
		
		Parrot parrot4 = new Parrot(new Rooster()); 		
		parrot4.walk();         
		parrot4.fly();         
		parrot4.sing();
		
		Parrot parrot5 = new Parrot(new Phone()); 		
		parrot5.walk();         
		parrot5.fly();         
		parrot5.sing();
	}

}
