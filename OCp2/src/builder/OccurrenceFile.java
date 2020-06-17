package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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
	
	
	/**
	 *  Builder of OccurrenceFile () : 
	 *
	 *  @see File class 
	 *  @see upload()
	 */
	public OccurrenceFile() {
		file = new File();
		file.upload();
	}
	
	
	/**
	 * print () displays the sort file of AZ and counts the number of occurrences
	 *
	 */
	public void print() throws IOException {
		
		map = new HashMap<String,Integer>();
		
		for(int i = 0 ; i < file.setFileTrie().size() ; i++)	{
			
			 if(map.containsKey(file.setFileTrie().get(i)))	{  
				 map.replace(file.setFileTrie().get(i),map.get(file.setFileTrie().get(i))+1);
			 }
			 else	{ 
				 map.put(file.setFileTrie().get(i),1);
			 }
		}	
	}

	
	/**
	 * save() save the file in "result.out.txt"
	 */
	public void save() throws IOException {
		// TODO Auto-generated method stub
        writer = new FileWriter ("result.out.txt");  
		sortedMap = new TreeMap<String, Integer>(map);
        Set set2 = sortedMap.entrySet();
        Iterator iterator2 = set2.iterator();
        
        while(iterator2.hasNext()) {
           Map.Entry me2 = (Map.Entry)iterator2.next();

           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
           
        writer.write(me2.getKey() + " : "+me2.getValue()+"\n");
   		}
        writer.write("Total number of symptomes : "+file.setFileTrie().size());
        writer.close();
        System.out.println();
		System.out.print("Total number of symptomes : "+file.setFileTrie().size());
	}
}

    