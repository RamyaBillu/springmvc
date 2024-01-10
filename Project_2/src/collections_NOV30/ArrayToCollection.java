package collections_NOV30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		String[] arr = { "ram", "vamsi", "prashanth" };
		List<String> arrayList = Arrays.asList(arr);
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object value = iterator.next();
			System.out.println(value);
		}

	}

}
