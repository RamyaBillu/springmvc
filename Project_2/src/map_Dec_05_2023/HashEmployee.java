package map_Dec_05_2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashEmployee {
	public static void main(String[] args) {
		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(new Employee("ram",22), 101);
		map.put(new Employee("ramya",24), 102);
		map.put(new Employee("rama",28), 104);
		map.put(new Employee("ramana",26), 107);
		map.put(new Employee("ramesh",29), 109);
		Iterator<Entry<Employee, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
		    Entry<Employee, Integer> entry = iterator.next();
		    Employee key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println("Key: " + key + ", Value: " + value);
		}



		
	}

}
