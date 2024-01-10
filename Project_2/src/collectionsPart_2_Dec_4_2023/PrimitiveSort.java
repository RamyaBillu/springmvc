package collectionsPart_2_Dec_4_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrimitiveSort  {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(20);

		set.add(30);
		set.add(40);
		set.add(50);
		Iterator iterator = set.iterator();
		System.out.println("Original HashSet:----");
		while (iterator.hasNext()) {
			int value = (int) iterator.next();
			System.out.println(value);
		}
//		List<Integer> list = new ArrayList<Integer>(set);
//		Collections.sort(list);
//		System.out.println("sorted order::" + list);

	}

	
	
	

}
