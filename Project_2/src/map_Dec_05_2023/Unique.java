package map_Dec_05_2023;

import java.util.HashSet;

import collections_NOV30.Student;

public class Unique {
	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<Employee>();
		set.add(new Employee("ram",19));
		set.add(new Employee("ram",19));
		set.add(new Employee("ram",19));

		set.add(new Employee("vamsi",20));
		set.add(new Employee("prashanth",22));
		for(Employee value:set) {
			System.out.println(value);
		}
	}

}
