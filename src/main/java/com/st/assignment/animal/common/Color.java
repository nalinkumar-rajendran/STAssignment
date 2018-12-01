package com.st.assignment.animal.common;

public interface Color {
	
	enum ColorEnum {
		GREY("gray"),
		ORANGE("orange");
		
		private String desc;
		private ColorEnum(String desc) {
			this.desc = desc;
		}
		public String getDesc() {
			return this.desc;
		}
	}
	
	void color();

}
