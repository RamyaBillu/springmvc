package map_Dec_05_2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Both {

	public static void main(String[] args) {
		HashMap< Integer,String> map = new HashMap<>();
		map.put(1, "BTECH");
		map.put( 2,"MCA");
		map.put( 3,"BSC");

		Iterator<Entry< Integer,String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
		    Entry< Integer,String> entry = iterator.next();
		    Integer key = entry.getKey();
		     String value = entry.getValue();
		    System.out.println("Key: " + key + ", Value: " + value);

	}

}
}
