package edu.rutgers.dimacs.TEST;

import java.util.ArrayList;
import java.util.HashMap;

public class RailRoadReader {

	
	public static ArrayList<HashMap<String, Object>> getRailWayData(
			String inventoryPath, String incidentFolder) {
		ArrayList<HashMap<String, Object>> finalList = 
				new ArrayList<HashMap<String, Object>>();
		
		ArrayList<Inventory> inventories = getInventories(inventoryPath);
		ArrayList<Incident> incidents = getIncidents(incidentFolder);
		
		for(Inventory inv : inventories) {
			for(Incident inci: incidents) {
				if(inci.getAttr("GXID").equals(inv.getAttr("crossing"))) {
					inv.addIncident(inci);
				}
			}
			
			finalList.add(inv.getMap());
		}
		
		return finalList;
	}
	
	public static ArrayList<Inventory> getInventories(String inventoryPath) {
		return null;
	}
	
	public static ArrayList<Incident> getIncidents(String incidentFolder) {
		
		return null;
	}
	
	
	
	
}
