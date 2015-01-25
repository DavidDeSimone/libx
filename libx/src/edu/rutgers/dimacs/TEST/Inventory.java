package edu.rutgers.dimacs.TEST;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

	private HashMap<String, Object> map;
	private static final String INCI_LIST = "IncidentList";
	
	public Inventory() {
		map = new HashMap<String, Object>();
		map.put(INCI_LIST, new ArrayList<Incident>());
	}
	
	public Object getAttr(String key) {
		return map.get(key);
	}
	
	public void addAttr(String key, Object value) {
		map.put(key, value);
	}
	
	public HashMap<String, Object> getMap() {
		return map;
	}
	
	public void addIncident(Incident inci) {
		ArrayList<Incident> list = (ArrayList<Incident>)getAttr(INCI_LIST);
		list.add(inci);
	}
	
	
	
}
