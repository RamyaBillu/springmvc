package wrapperClasses_NOV27;

public class StringToPrimitiveWithException {
	public static void main(String[] args) {
		String str = "123abc";

		try {
			int num = Integer.parseInt(str);

			System.out.println("Num: " + num); // prints out 123
		} catch (NumberFormatException e) {
			System.out.println("String does not contain a valid integer!");
		}

	}
}
