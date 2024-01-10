package wrapperClasses_NOV27;

public class Utility {

	public static void main(String[] args) {
		
		String str = "123";
		Integer integer=(Integer.valueOf("125"));
		System.out.println(integer);
		
		try {
		int num = Integer.parseInt(str);
		Integer integer1=Double.valueOf("1234.89").intValue();
		System.out.println(integer1);
		System.out.println("Num: " + num); // prints out 123
		} catch (NumberFormatException e) {
		System.out.println("String does not contain a valid integer!");
		}
      
	}

}
