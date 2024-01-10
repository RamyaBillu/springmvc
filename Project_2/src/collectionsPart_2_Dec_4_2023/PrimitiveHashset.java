package collectionsPart_2_Dec_4_2023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class PrimitiveHashset {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		Iterator iterator =set.iterator();
		while(iterator.hasNext())
		{
			int value=(int) iterator.next();
			System.out.println(value);
		}

}
}
