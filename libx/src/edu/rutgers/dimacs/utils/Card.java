package edu.rutgers.dimacs.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.rutgers.dimacs.exceptions.KeyNotFoundException;
import edu.rutgers.dimacs.reader.DataComparator;

public abstract class Card implements DataComparator {
	
	private HashMap<String, Object> cardAttrs;
	private String cardID;
	
	public Card(HashMap<String, Object> cardAttrs, String ID) {
		this.cardAttrs = cardAttrs;
		this.cardID = ID;
	}
	
	public Object getValue(String key) throws KeyNotFoundException {
		if(cardAttrs == null || !cardAttrs.containsKey(key)) {
			throw new KeyNotFoundException();
		}
		
		return cardAttrs.get(key);
	}
	
	public boolean setValue(String key, Object value) {
		if(cardAttrs == null) {
			return false;
		}
		
		cardAttrs.put(key, value);
		return true;
	}
	
	@Override 
	public String toString() {
		return cardID;
	}
	
	@Override
	public boolean equals(Object otherCard) {
		if(otherCard == null || !(otherCard instanceof Card)) {
			return false;
		}
		Card card = (Card)otherCard;
		
		return cardID.equals(card.toString());
	}
	
	public List<Pair> getList() {
		List<Pair> pairs = new ArrayList<Pair>();
		
		for(String s :cardAttrs.keySet()) {
			Pair p = new Pair(s, cardAttrs.get(s));
			pairs.add(p);
		}
		
		return pairs;
	}
	
	
}
