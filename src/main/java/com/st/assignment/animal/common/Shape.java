package com.st.assignment.animal.common;

public interface Shape {
	
	enum ShapeSize {
		LARGE("large"),
		SMALL("small");
		
		private String desc;
		private ShapeSize(String desc) {
			this.desc = desc;
		}
		public String getDesc() {
			return this.desc;
		}
	}
	
	void shape();

}
