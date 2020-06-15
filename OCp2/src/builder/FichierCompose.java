package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public class FichierCompose extends FichierBuilder {
	
	public Map<String,Integer> map;
	public Map<String, Integer> sortedMap;
	
	public FichierCompose() {
		fichier = new Fichier();
		fichier.upload();
	}
	
	
	@Override
	public void print() throws IOException {
		
		// TODO Auto-generated method stub
		map = new HashMap<String,Integer>();
		
		for(int i = 0 ; i < fichier.setFileTrie().size() ; i++)	{
			
			 if(map.containsKey(fichier.setFileTrie().get(i)))	{  
				 
				 map.replace(fichier.setFileTrie().get(i),map.get(fichier.setFileTrie().get(i))+1);
			 
			 }
		
			 else	{ 
				 map.put(fichier.setFileTrie().get(i),1);
			 }
		}	
	}

	@Override
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
        writer.close();
	}
		
}

    