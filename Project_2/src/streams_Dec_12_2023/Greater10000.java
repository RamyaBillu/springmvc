package streams_Dec_12_2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Greater10000 {

	public static void main(String[] args) {
		List<Employee> item=new ArrayList<Employee>();

		item.add(new Employee("rama",200099));
		item.add(new Employee("ramana",60000));
		item.add(new Employee("ramesh",4000));
		List item2=item.stream().filter(e -> e.getSalary()>10000).collect(Collectors.toList());
		item2.forEach(e->System.out.println(e));

	}

}
