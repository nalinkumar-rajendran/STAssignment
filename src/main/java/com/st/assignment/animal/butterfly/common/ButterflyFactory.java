package com.st.assignment.animal.butterfly.common;

import java.util.EnumMap;

import com.st.assignment.animal.butterfly.Butterfly;
import com.st.assignment.animal.butterfly.Caterpillar;

public class ButterflyFactory {
	
	private static EnumMap<ButterflyStage, ButterflyFamily> butterflyEnumMap;
	
	static {
		butterflyEnumMap = new EnumMap<>(ButterflyStage.class);
		butterflyEnumMap.put(ButterflyStage.CATERPILLAR, new Caterpillar());
		butterflyEnumMap.put(ButterflyStage.BUTTERFLY, new Butterfly());
	}
	
	public enum ButterflyStage {
		CATERPILLAR,
		BUTTERFLY;
	}
	
	public static ButterflyFamily getInstance(ButterflyStage butterflyStage) {
		return butterflyEnumMap.get(butterflyStage);
	}

}