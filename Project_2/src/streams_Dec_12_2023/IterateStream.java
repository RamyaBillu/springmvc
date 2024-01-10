package streams_Dec_12_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IterateStream {
	public static void main(String[] args) {
		List<Employee> item=new ArrayList<Employee>();
		item.add(new Employee("rama",23));
		item.add(new Employee("ramana",23));
		item.add(new Employee("ramesh",23));
		Stream s=item.stream();
		s.forEach(e->System.out.println(e));

		
	}

}
