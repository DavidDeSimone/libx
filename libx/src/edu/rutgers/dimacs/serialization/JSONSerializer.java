package edu.rutgers.dimacs.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import edu.rutgers.dimacs.utils.Card;

public class JSONSerializer {
	private String saveAs;
	private List<Card> cards;
	
	public JSONSerializer(String saveAs, List<Card> cards) {
		this.saveAs = saveAs;
		this.cards = cards;
	}
	
	public void save() {
		try {
			FileOutputStream writer = new FileOutputStream(new File(saveAs));
		
			//TODO Serialize Graph in JSON format
			//For each card, form a vertex with atts
			//for each pair of vertices, calculate comparison, form link
			//serialize cards
			//serialize final json in the form [nodes, links, cards]
			//write to disk
		
		
			writer.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
