package map_Dec_05_2023;

import java.util.Comparator;

public class NameComparator implements Comparator <Employee>{

	
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
