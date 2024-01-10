package streams_Dec_12_2023;

public class Employee {
	private String name;
	private long salary;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
//	public Employee(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", age=" + age + "]";
//	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public Employee(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
