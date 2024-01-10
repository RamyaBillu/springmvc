package streams_Dec_13_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {
	public static void main(String[] args) {
	     List<Student>value=new ArrayList<Student>();
	     value.add(new Student(1,"queen","female","cse","tirupati,234","RENIGUNTA","AP"));
	     value.add(new Student(2,"ram","male","ece","nellore,1234","Chinthala","AP"));
	     value.add(new Student(3,"amith","male","civil","bangalore,01234","Whitefield","KS"));
	     value.add(new Student(4,"shalini","female","mech","bangalore,234","marathahalli","KS"));
	     value.add(new Student(5,"vaishali","female","mech","srikakulam,234","bapatla","AP"));
//	     value.stream().filter(e1->e1.getDepartment().equalsIgnoreCase("mech")).
//			filter(e2->e2.getGender().equals("female")).forEach(e3->System.out.println(e3));	    
//	
//	      List<Student> Female=value.stream().filter(e1->e1.getDepartment().equalsIgnoreCase("mech")).
//			filter(e2->e2.getGender().equals("female").collect(Collecto rs.toList()));
	    List femaleList=value.stream().filter(e1->e1.getDepartment().equals("mech")).filter(e2->e2.getGender().equals("female")).collect(Collectors.toList());
     System.out.println(femaleList);
	}
	}
	


