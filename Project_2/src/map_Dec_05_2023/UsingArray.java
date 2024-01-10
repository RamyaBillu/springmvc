package map_Dec_05_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import collections_NOV30.SortingStudent;
import collections_NOV30.Student;
import java.util.*;

public class UsingArray {

	// Main driver method
	public static void main(String args[]) {

		// Creating an empty ArrayList of Student type
		ArrayList<Employee> arraylist = new ArrayList<Employee>();

		// Adding elements to above List
		arraylist.add(new Employee("Riya", 15));
		arraylist.add(new Employee("Mahima", 16));
		arraylist.add(new Employee("Shubhi", 15));
		NameComparator nameComparator = new NameComparator();

		Set<Employee> set = new TreeSet<>(nameComparator);
		set.addAll(arraylist);
		for (Object value : set) {
			System.out.println(value);
		}

	}

}
