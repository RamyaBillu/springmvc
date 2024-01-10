package generics_NOV28;

public class BoundTypeParameter {

	// Generic method with a bound type parameter

	public static <T extends Number> double squareAndSum(T num1) {
		double squareSum = Math.pow(num1.doubleValue(), 2);
		;
		return squareSum;
	}

	public static void main(String[] args) {
		// Example with Integer
		Integer int1 = 3;
		double resultInt = squareAndSum(int1);
		System.out.println("Result with Integer: " + resultInt);

		// Example with Double
		Double double1 = 2.5;
		double resultDouble = squareAndSum(double1);
		System.out.println("Result with Double: " + resultDouble);

		// This will result in a compilation error because String is not a subclass of
		// Number
		// String str1 = "Hello";
		// double resultStr = squareAndSum(str1);
	}

}
