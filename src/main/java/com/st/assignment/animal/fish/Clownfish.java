package com.st.assignment.animal.fish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.common.Color;
import com.st.assignment.animal.common.Joking;
import com.st.assignment.animal.common.Shape;

public class Clownfish extends Fish implements Color, Shape, Joking {
	
	private static final Logger logger = LoggerFactory.getLogger(Clownfish.class);
	
	private ColorEnum color;
	private ShapeSize shape;
	private boolean jokes;

	public boolean isJokes() {
		return jokes;
	}

	
	@Override
	public void joke() {
		if(jokes)
			System.out.println("I'm joking");	
		
	}
	
	@Override
	public void color() {
		if(color != null) {
			if(logger.isInfoEnabled())
				logger.info("I'm " + color.getDesc() + " color" );
			}
	}
	
	
	@Override
	public void shape() {
		if(shape != null) {
			if(logger.isInfoEnabled())
				logger.info("I'm " + shape.getDesc() );
			}
		
	}
		
	private Clownfish(ClownfishCreator clownfishCreator) {		
		this.color = clownfishCreator.color;
		this.shape = clownfishCreator.shape;
		this.jokes = clownfishCreator.jokes;
		
	}
	
	public static class ClownfishCreator {
		private ColorEnum color;
		private ShapeSize shape; 
		private boolean jokes;
		
		public ClownfishCreator(ColorEnum color, ShapeSize shape) {
			this.color = color;
			this.shape = shape;				
		}		
		
		public ClownfishCreator setJokes(boolean jokes) { 
			this.jokes = jokes;
			return this;
		}
		
		public Clownfish create(){
			return new Clownfish(this);
		}
	}
}
