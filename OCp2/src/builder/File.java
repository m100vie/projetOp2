package builder;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 * <b>File is the class representing the file "symptoms.txt" in ArrayList form</b>
 *
 * 
 * @author Matthieu
 * @version 2.0
 */
public class File {
	
	
	 /**
	 * <b> File property, contains the file "symptoms.txt" in ArrayList form</b>
	 * 
	 * @see upload()
     */
	public ArrayList<String> file = new ArrayList<String>();
	
   
	
	/**
	 * <b> Save the file "Symptoms.txt" in file with the BufferedReader </b>
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
			catch (IOException e) {
				e.printStackTrace();
			}
		}
    }

    
	
	/**
	 * <b> Sort file in AZ order thanks to Collections.sort ()  </b>
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