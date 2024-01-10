package map_Dec_05_2023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add(new Employee("dhraksha",45));
		set.add(new Employee("dhraksha",45));
		set.add(new Employee("dhraksha",45));

		set.add(new Employee("raksha",43));
		set.add(new Employee("shalini",43));
		Iterator iterate=set.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}

		
	}

}
