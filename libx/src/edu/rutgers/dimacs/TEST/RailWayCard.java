package edu.rutgers.dimacs.TEST;

import java.util.HashMap;

import edu.rutgers.dimacs.utils.Card;
import edu.rutgers.dimacs.utils.JaccardCalc;
import edu.rutgers.dimacs.utils.Pair;

public class RailWayCard extends Card {

	public RailWayCard(HashMap<String, Object> map, String id) {
		super(map, id);
	}
	
	
	
	@Override
	public double dataCompTo(Card otherCard) {
		JaccardCalc<Pair> calc = new JaccardCalc<Pair>(getList(), otherCard.getList(), 512);
		return calc.getJaccardApprox();
	}

}
