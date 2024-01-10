package collections_NOV30;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator,Comparable <Student> {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());

 
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	


//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}

	

}
