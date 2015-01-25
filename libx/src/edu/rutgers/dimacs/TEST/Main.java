package edu.rutgers.dimacs.TEST;

import java.util.HashMap;
import java.util.List;

import edu.rutgers.dimacs.serialization.JSONSerializer;
import edu.rutgers.dimacs.utils.Card;
import edu.rutgers.dimacs.utils.CardGenerator;
import edu.rutgers.dimacs.utils.DefaultCard;

public class Main {

	
	public static void main(String args[]) {
		
		List<HashMap<String, Object>> list = RailRoadReader.getRailWayData(args[0], args[1]);
		List<Card> gen = CardGenerator.generateCards(list, null, RailWayCard.class);
		
		JSONSerializer json = new JSONSerializer("railway.json", gen);
		json.save();
		
	}
	
	
	
	
	
}
