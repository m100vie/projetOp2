package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mymap {

	Map<String, Integer> map;
	Map<String, Integer> sortedMap;

	public Iterator<Entry<String, Integer>> mapinit(ArrayList<String> file) {

		map = new HashMap<String, Integer>();

		for (String string : file) {
			if (map.containsKey(string)) {
				map.replace(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}

		sortedMap = new TreeMap<String, Integer>(map);
		Set<Entry<String, Integer>> set2 = sortedMap.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = set2.iterator();

		return iterator2;
	}
}
