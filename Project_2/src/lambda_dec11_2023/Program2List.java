package lambda_dec11_2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import collections_NOV30.Student;

public class Program2List {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		l.add(new Student("ram",23));
		l.add(new Student("anu",24));
		l.add(new Student("amala",23));
		l.add(new Student("isha",28));
		l.add(new Student("rani",28));
		
		Comparator<Student> comparator=(Student,student2)->{
			
			return Student.getName().compareTo(student2.getName());
			
		};
		l.sort(comparator);
		for(Student value:l){
			System.out.println(value);
			
		}
		

		
		

	}

}
