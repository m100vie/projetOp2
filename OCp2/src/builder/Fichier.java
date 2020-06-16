package builder;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 * <b>Fichier est la classe représentant le fichier "symptoms.txt" sous forme ArrayList</b>
 *
 * 
 * @author Matthieu
 * @version 1.0
 */
public class Fichier {
	
	
	 /**
	 * <b> Propriété de Fichier, contient le fichier "symptoms.txt" sous forme ArrayList</b>
	 * 
	 * @see upload()
     */
	public ArrayList<String> file = new ArrayList<String>();

   
	
	/**
	 * <b> Enregistre le fichier "Symptoms.txt" dans file grâce au BufferedReader </b>
	 * 
	 * @see file
	 */
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

    
	
	/**
	 * <b> Tri file par ordre AZ grâce au Collections.sort()  </b>
	 * 
	 * @return file
	 * 
	 * @see file
	 */
	public ArrayList<String> setFileTrie() {
        // TODO implement here
    	Collections.sort(file);
    	return file;
    }
}