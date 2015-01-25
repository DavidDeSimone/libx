package edu.rutgers.dimacs.utils;

public class Pair {

	private String key;
	private Object value;
	
	public Pair(String key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	
	public Object getValue() {
	
		return value;
	}
	
	@Override
	public boolean equals(Object otherPair) {
		if(otherPair == null || !(otherPair instanceof Pair)) {
			return false;
		}
		Pair pair = (Pair)otherPair;
		
		if(key.equals(pair.getKey())
				&& value.equals(pair.getValue())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
}
