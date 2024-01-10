package lambda_dec11_2023;

public class Employee {
	
		public Employee(String str)
		{
			System.out.println("second");
			System.out.println(str);
			System.out.println("third");
		}
		public static void main(String[] args) {
			EmployeeInterface program7;
			program7 = Employee::new; // here implementing the get() of interface
			program7.get("pravalika Dasari");		
		}
	}


