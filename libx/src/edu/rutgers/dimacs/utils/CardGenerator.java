package edu.rutgers.dimacs.utils;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CardGenerator {

	private static int currentID = 0;
	
	public static List<Card> generateCards(
			List<HashMap<String, Object>> listMap, String idKey, Class myCard) {
		List<Card> cards = new ArrayList<Card>();

		for (HashMap<String, Object> map : listMap) {
			String newId = new String();
			if (idKey == null) {
				newId = String.valueOf(currentID);
				currentID++;
			} else {
				newId = (String) map.get(idKey);
			}

			try {
				Constructor<?> constructor = myCard.getConstructor(myCard);
				Object newObj = constructor.newInstance(map, newId);
				cards.add((Card)newObj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return cards;
	}

}
