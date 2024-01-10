package collectionsPart_2_Dec_4_2023;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import collections_NOV30.SortingStudent;
import collections_NOV30.Student;

public class SortStudent {
	public static void main(String[] args) {
		SortingStudent sortingStudent = new SortingStudent();
		TreeSet<Student> list=new TreeSet<>(sortingStudent);


		list.add(new Student("ram",19));
		list.add(new Student("ram",19));
		list.add(new Student("ram",19));

		list.add(new Student("vamsi",20));
		list.add(new Student("prashanth",22));
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			 Student object=(Student) iterator.next();
			 System.out.println(object);
		}
		
					

}
}
