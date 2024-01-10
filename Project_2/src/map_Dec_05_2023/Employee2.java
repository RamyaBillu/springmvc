package map_Dec_05_2023;

public class Employee2 {
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee2(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", location=" + location + "]";
	}

}
