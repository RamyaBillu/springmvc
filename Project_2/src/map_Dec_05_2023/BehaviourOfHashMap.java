package map_Dec_05_2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class BehaviourOfHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ANUSHA", 1);
		map.put("BHAVYA", 2);
		map.put("CHARITHA", 3);
		System.out.println("first way of iterating a  map");

		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
		    Entry<String, Integer> entry = iterator.next();
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println("Key: " + key + ", Value: " + value);
		}
		System.out.println("==============================");
		System.out.println("2nd way of iterating a map");
		

		for (String key : map.keySet()) {
		    Integer value = map.get(key);
		    System.out.println("Key: " + key + ", Value: " + value);
		}
		
	}

}
