package jdbc;


	import java.sql.ResultSet;
	import java.util.Iterator;
	import java.util.List;


	public class Student 
	{
		private int id;
		private String name;
		private long phone;
		private String pwd;
		private double marks;
		private String location;
		
		
		public Student(int id, String name, long phone, String pwd, double marks, String location) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.pwd = pwd;
			this.marks = marks;
			this.location = location;
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
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", pwd=" + pwd + ", marks=" + marks
					+ ", location=" + location + "]";
		}
		
		public static void fetch() 
		{
			List<Student> list = FetchRecordsByST.fetchResultSet();
			Iterator<Student> listIterator = list.iterator();
			while(listIterator.hasNext())
			{
				System.out.println(listIterator.next());
			}		
		}
		
	}


