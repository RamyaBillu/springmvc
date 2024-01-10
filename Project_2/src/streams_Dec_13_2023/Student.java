package streams_Dec_13_2023;

public class Student {
	private int id;
	private String name;
	private String gender;
	private String department;
	private String address;
	private String city;
	private String state;

	public Student(int id, String name, String gender, String department, String address, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
