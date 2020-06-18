package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import other.Mymap;

/**
 * <b>OccurrenceFile is a class allowing to build a File, to display it sorted of AZ and to count the occurrences, and to record it.</b>
 * <p>
 * OccurrenceFile extends to FBuilderFiles
 * </p>
 * 
 * @see File
 * @see BuilderFiles 
 * 
 * @author Matthieu
 * @version 2.0
 */
public class OccurrenceFile extends BuilderFiles {
	
	Mymap mymap;
	Iterator iterator;
	/**
	 *  Builder of OccurrenceFile () : 
	 *
	 *  @see File class 
	 *  @see upload()
	 */
	public OccurrenceFile() {
		file = new File();
		file.upload();
		
		 mymap = new Mymap();
        
         iterator = mymap.mapinit(file.setFileTrie());
	}
	
	
	
	
	/**
	 * print () displays the sort file of AZ and counts the number of occurrences
	 *
	 */
	public void print() {
		
        
		while(iterator.hasNext()) {
           
			Map.Entry me2 = (Map.Entry)iterator.next();

           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
        }
        System.out.println();
		System.out.print("Total number of symptomes : "+file.setFileTrie().size());
	}

	
	/**
	 * save() save the file in "result.out.txt"
	 */
	public void save() throws IOException {
		// TODO Auto-generated method stub
        writer = new FileWriter ("result.out.txt");  
        
        
		
        while(iterator.hasNext()) {
           
        	Map.Entry me2 = (Map.Entry)iterator.next();

            writer.write(me2.getKey() + " : "+me2.getValue()+"\n");
   		}
        writer.write("Total number of symptomes : "+file.setFileTrie().size());
        writer.close();
	}
}

    