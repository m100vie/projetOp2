import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	
	public  ReadSymptomDataFromFile (String filepath) throws IOException {
		this.filepath = filepath;
		
		this.getSymptoms();
		
		GetSortAlphabetically (CountSymptom(getSymptoms()));
		
		
		
		}
	
	@Override
	public ArrayList<String> getSymptoms() {

		ArrayList<String> result = new ArrayList<String>();
		
	    //Map<Int
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;	    
	}

	private Map CountSymptom (ArrayList<String> result) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
			for(int i = 0 ; i < result.size() ; i++){
				
				 if(map.containsKey(result.get(i))){  
					 
					 map.replace(result.get(i),map.get(result.get(i))+1);
				 
				 }
			
				 else	{ 
					 map.put(result.get(i),1);
				 }
			}
			return map;
			
	}

	private void GetSortAlphabetically (Map countresult) throws IOException {
		FileWriter writer = new FileWriter ("result.out.txt");  
		
		Map sortedMap = new TreeMap(countresult);
        Set set2 = sortedMap.entrySet();
        Iterator iterator2 = set2.iterator();
        
        while(iterator2.hasNext()) {
           Map.Entry me2 = (Map.Entry)iterator2.next();

           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
           
        
   		
   		writer.write(me2.getKey() + " : "+me2.getValue()+"\n");
   		}
        writer.close();
		

	}


}
