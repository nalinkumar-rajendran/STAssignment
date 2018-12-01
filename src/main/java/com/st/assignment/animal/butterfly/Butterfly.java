package com.st.assignment.animal.butterfly;

import com.st.assignment.animal.butterfly.common.ButterflyFamily;
import com.st.assignment.animal.common.NonWalking;

public class Butterfly implements ButterflyFamily, NonWalking {
	

	@Override
	public void walk() {
		throw new RuntimeException("Can not walk");
	}
}
