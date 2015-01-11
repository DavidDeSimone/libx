package edu.rutgers.dimacs.utils;

import java.util.HashMap;

public class DefaultCard extends Card {

	protected static final int DEFAULT_ITERATIONS = 200;
	
	public DefaultCard(HashMap<String, Object> map, String id) {
		super(map, id);
	}
	
	
	@Override
	public double dataCompTo(Card otherCard) {
		JaccardCalc<Pair> calc = new JaccardCalc<Pair>(getList(), otherCard.getList(), DEFAULT_ITERATIONS);
		double result = calc.getJaccardApprox();
		
		return result;
	}

}
