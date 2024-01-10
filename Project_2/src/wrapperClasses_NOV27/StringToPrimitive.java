package wrapperClasses_NOV27;

public class StringToPrimitive {
	    public static void main(String[] args) {
	        // Convert String to int
	        String intString = "123";
	        int intValue = Integer.parseInt(intString);
	        System.out.println("Converted int value: " + intValue);

	        // Convert String to double
	        String doubleString = "45.67";
	        double doubleValue = Double.parseDouble(doubleString);
	        System.out.println("Converted double value: " + doubleValue);

	        // Convert String to boolean
	        String booleanString = "true";
	        boolean booleanValue = Boolean.parseBoolean(booleanString);
	        System.out.println("Converted boolean value: " + booleanValue);
	    }
	}



