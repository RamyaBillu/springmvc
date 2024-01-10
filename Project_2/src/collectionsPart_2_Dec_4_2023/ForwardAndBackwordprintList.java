package collectionsPart_2_Dec_4_2023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ForwardAndBackwordprintList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("forward");
		Iterator iterator =list.iterator();
		while(iterator.hasNext())
		{
			int value=(int) iterator.next();
			System.out.println(value);
		}
		System.out.println("backward");


		ListIterator listIterator=list.listIterator(list.size());
		while(listIterator.hasPrevious()) {
			int value=(int)listIterator.previous();
			System.out.println(value);
		}
			
		}
}
