package map_Dec_05_2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;


public class BasedName {

	
		public static void main(String[] args) {
			NameComparator nameComparator=new NameComparator(); 

			HashMap<Employee2, Integer> map = new HashMap<>();
			map.put(new Employee2("ram","tirupati"), 101);
			map.put(new Employee2("anu","ananthapur"), 102);
			map.put(new Employee2("indhira","chennai"), 104);
			
			NameComp comparator = new  NameComp();
			TreeSet<Employee2> set = new  TreeSet<>(comparator);
			set.addAll(map.keySet());
			for(Employee2 value:set) {
			System.out.println(value+" "+map.get(value));
			}

			}
			
		}







