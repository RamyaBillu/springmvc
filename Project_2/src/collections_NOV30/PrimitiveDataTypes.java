package collections_NOV30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		ArrayList<Character> arrayList = new ArrayList<>();
		arrayList.add('r');
		arrayList.add('a');
		arrayList.add('m');
		arrayList.add('y');
		arrayList.add('a');
		arrayList.add('v');
		arrayList.add('a');
		arrayList.add('m');
		arrayList.add('s');
		arrayList.add('i');
		// using for loop
		for (Character character : arrayList) {
			char ch = character;
			System.out.println(ch);

		}
		// using iterator
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			char ch = (char) iterator.next();
			System.out.println(ch);
		}

	}

}
