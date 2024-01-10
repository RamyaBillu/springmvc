package streams_Dec_12_2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class MaxMin {

	public static void main(String[] args) {
		List<Employee> item=new ArrayList<Employee>();

		item.add(new Employee("rama",200099));
		item.add(new Employee("ramana",60000));
		item.add(new Employee("ramesh",4000));
		System.out.println(item.stream().map(e -> e.getSalary())
				.max(Comparator.naturalOrder()).get());		
		System.out.println(item.stream().map(e -> e.getSalary())
				.min(Comparator.naturalOrder()).get());		
		

	}

}
