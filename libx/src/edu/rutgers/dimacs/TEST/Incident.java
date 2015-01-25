package edu.rutgers.dimacs.TEST;

import java.util.HashMap;

public class Incident {

	private HashMap<String, Object> map;
	
	public Incident() {
		map = new HashMap<String, Object>();
	}
	
	public void addAttr(String key, Object value) {
		map.put(key, value);
	}
	
	public Object getAttr(String key) {
		return map.get(key);
	}
	
	
	
	
}
