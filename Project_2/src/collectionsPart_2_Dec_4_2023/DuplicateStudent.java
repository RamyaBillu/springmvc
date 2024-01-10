package collectionsPart_2_Dec_4_2023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import collections_NOV30.Student;

public class DuplicateStudent {

		public static void main(String[] args) {
			HashSet<Student> list=new HashSet<>();
			list.add(new Student("ram",19));
			list.add(new Student("ram",19));
			list.add(new Student("ram",19));

			list.add(new Student("vamsi",20));
			list.add(new Student("prashanth",20));
			Iterator iterator=list.iterator();
			while(iterator.hasNext()) {
				 Student object=(Student) iterator.next();
				 System.out.println(object);
			}
			
						
			

			}
				
			}

			
			



