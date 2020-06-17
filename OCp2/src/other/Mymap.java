package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mymap {
	
	Map<String,Integer> map;
	Map sortedMap;
	
	
	
	public Iterator mapinit(ArrayList<String> file) {
		
		map = new HashMap<String,Integer>();
	
		for(int i = 0 ; i < file.size() ; i++)	{
			
			 if(map.containsKey(file.get(i)))	{  
				 map.replace(file.get(i),map.get(file.get(i))+1);
			 }
			 else	{ 
				 map.put(file.get(i),1);
			 }
		}
		sortedMap = new TreeMap<String, Integer>(map);
		Set set2 = sortedMap.entrySet();
		Iterator iterator2 = set2.iterator(); 
		
		return iterator2;
	}
}

