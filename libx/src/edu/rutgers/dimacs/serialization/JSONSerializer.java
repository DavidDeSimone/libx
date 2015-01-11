package edu.rutgers.dimacs.serialization;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JSONSerializer {
	private String saveAs;
	
	public JSONSerializer(String saveAs) {
		this.saveAs = saveAs;
	}
	
	public void save() {
		try {
			FileOutputStream writer = new FileOutputStream(new File(saveAs));
		
			//TODO Serialize Graph in JSON format
		
		
			writer.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
