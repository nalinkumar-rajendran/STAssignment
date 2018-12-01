package com.st.assignment.animal.common;

public interface Eating {
	
	enum EatingMenu {
		FISH("fish");
		
		private String desc;
		private EatingMenu(String desc) {
			this.desc = desc;
		}
		public String getDesc() {
			return this.desc;
		}
	}
	
	void eat();

}
