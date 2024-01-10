package wrapperClasses_NOV27;

public class BoxingUn {

	public static void main(String[] args) {
		Integer integer = new Integer(102);// boxing
		System.out.println(integer);
		Integer integer1 = 102;// auto boxing
		System.out.println(integer1);

		int item = Integer.valueOf(integer1);// un-boxing
		System.out.println(item);
		int item2 = integer1;// auto un-boxing
		System.out.println(item2);

	}
}
