package com.st.assignment.solution;

import com.st.assignment.animal.bird.Chicken;
import com.st.assignment.animal.bird.Duck;

public class SolutionA2 {
	
	public static void main(String[] args) {
		Duck duck = new Duck();         
		duck.walk();         
		duck.fly();         
		duck.sing();
		
		Chicken chicken = new Chicken();         
		chicken.walk();         
		chicken.sing();
	}

}
