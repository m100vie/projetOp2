package builder;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public class Fichier {
	
	
	
 public ArrayList<String> file = new ArrayList<String>();

    public  void upload() {
        // TODO implement here
    	if ("Symptoms.txt" != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader("Symptoms.txt"));
				String line = reader.readLine();
				
				while (line != null) {
					file.add(line);
					line = reader.readLine();
				}
				reader.close();
			} 
			
			catch(FileNotFoundException e) {
			    System.out.println("Fichier non trouve !");
			    }
			
		     catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
		
		
	    
    }

    public ArrayList<String> setFileTrie() {
        // TODO implement here
    	Collections.sort(file);
    	return file;
    }

}