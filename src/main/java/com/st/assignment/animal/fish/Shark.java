package com.st.assignment.animal.fish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.st.assignment.animal.common.Color;
import com.st.assignment.animal.common.Eating;
import com.st.assignment.animal.common.Shape;

public class Shark extends Fish implements Color, Shape, Eating {
	
	private static final Logger logger = LoggerFactory.getLogger(Shark.class);
	
	private ColorEnum color;
	private ShapeSize shape;
	private EatingMenu eatingMenu;
	
	public EatingMenu getEatingMenu() {
		return eatingMenu;
	}
		
	@Override
	public void eat() {
		if(eatingMenu != null) {
		if(logger.isInfoEnabled())
			logger.info("I'm eating " + eatingMenu.getDesc());	
		}
		
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
		
	private Shark(SharkCreator sharkCreator) {		
		this.color = sharkCreator.color;
		this.shape = sharkCreator.shape;
		this.eatingMenu = sharkCreator.eatingMenu;		
	}
	
	public static class SharkCreator {
		private ColorEnum color;
		private ShapeSize shape; 
		private EatingMenu eatingMenu;
		
		public SharkCreator(ColorEnum color, ShapeSize shape) {
			this.color = color;
			this.shape = shape;		
		}		
		
		public SharkCreator setEatingMenu(EatingMenu eatingMenu) {
			this.eatingMenu = eatingMenu;
			return this;
		}
		
		public Shark create(){
			return new Shark(this);
		}
	}

}
