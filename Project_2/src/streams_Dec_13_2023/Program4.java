package streams_Dec_13_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program4 {
	public static void main(String[] args) {

		ArrayList<Student> values = new ArrayList<Student>();
		values.add(new Student(1, "queen", "female", "cse", "tirupati,234", "RENIGUNTA", "AP"));
		values.add(new Student(2, "ram", "male", "ece", "nellore,1234", "Chinthala", "AP"));
		values.add(new Student(3, "amith", "male", "civil", "bangalore,01234", "Whitefield", "KS"));
		values.add(new Student(4, "shalini", "female", "mech", "bangalore,234", "marathahalli", "KS"));
		values.add(new Student(5, "vaishali", "female", "mech", "srikakulam,234", "bapatla", "AP"));

		values.stream().collect(Collectors.groupingBy(Student::getDepartment)).entrySet().forEach(e -> {
			System.out.println(e.getKey() + ":-");
			e.getValue().forEach(e2 -> System.out.println(e2.getName()));
		});

	}
}
