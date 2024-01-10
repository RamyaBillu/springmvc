package map_Dec_05_2023;

import java.util.Comparator;

public class NameComp 	 implements Comparator <Employee2>{


		
		public int compare(Employee2 o1, Employee2 o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}

	}


