package collections_NOV30;

import java.util.Iterator;
import java.util.LinkedList;

public class PrintingCollection {

	public static void main(String[] args) {
		LinkedList<Double> linkedList = new LinkedList<>();
		linkedList.add(10.56);
		linkedList.add(20.56);
		linkedList.add(30.56);
		linkedList.add(50.56);

		Iterator<Double> integer = linkedList.iterator();
		while (integer.hasNext()) {
			double value = integer.next();
			System.out.println(value);
		}

	}

}
