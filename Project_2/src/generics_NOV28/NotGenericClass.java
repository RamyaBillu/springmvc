package generics_NOV28;

public class NotGenericClass {

	    // Generic method in a non-generic class
	    public static <D> void printItem(D value) {
	        System.out.println("The value is: " + value);
	    }

	    public static void main(String[] args) {
	        // Accessing the generic method with Integer type
	        printItem(42);

	        // Accessing the generic method with String type
	        printItem("Hello, Generics!");

	        // Accessing the generic method with Double type
	        printItem(3.14);
	    }
	}



