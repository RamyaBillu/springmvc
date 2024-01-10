package wrapperClasses_NOV27;

public class StringOrNumber {
	// Java program to check whether given string
	// is a valid  number.

		public static void main(String[] args)
		{
			String input1 = "105.4";

			try {
				// checking valid float using parseInt() method
				Float.parseFloat(input1);
//				Integer.parseInt(input1);
//				Double.parseDouble(input1);
//				Short.parseShort(input1);
//				Byte.parseByte(input1);
//				Long.parseLong(input1);
				System.out.println(
					input1 + " is a valid float number");
			}
			catch (NumberFormatException e) {
				System.out.println(
					input1 + " is  a string ");
			}

		}
	}



