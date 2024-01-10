package collections_NOV30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentCollection {
	public static  void main(String[]args)
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("anusha",34));
		list.add(new Student("usha",54));
		list.add(new Student("anu",44));
		list.add(new Student("isha",94));
		Collections.sort(list);
		System.out.println(list);
		SortingStudent sortingStudent = new SortingStudent();
		Set<Student> set=new TreeSet<>(sortingStudent);
		set.addAll(list);
//		
//		for(Object value:set) {
//			System.out.println(value);
//		}
		
	}
	
	

}
