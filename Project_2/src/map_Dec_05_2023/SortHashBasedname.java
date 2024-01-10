package map_Dec_05_2023;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class SortHashBasedname {
	public static void main(String[] args) {
		NameComparator nameComparator=new NameComparator(); 

		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(new Employee("ram",22), 101);
		map.put(new Employee("anu",24), 102);
		map.put(new Employee("indhira",28), 104);
		map.put(new Employee("mani",26), 107);
		map.put(new Employee("amrutha",29), 109);
		NameComparator comparator = new  NameComparator();
		TreeSet<Employee> set = new  TreeSet<>(comparator);
		set.addAll(map.keySet());
		for(Employee value:set) {
		System.out.println(value+" "+map.get(value));
		}

		}
		
	}




