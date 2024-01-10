package collections_NOV30;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class IteratorAndEnumeration {

	public static void main(String[] args) {
		LinkedList<Integer>linkedList=new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		Iterator iterator=linkedList.iterator();
		while (iterator.hasNext()) {
			Object value = iterator.next();
			System.out.println(value);
			iterator.remove();
			System.out.println("size"+"="+linkedList.size());
		

	}
		System.out.println("======================");
		Vector<Integer>vector=new Vector<>();
		vector.add(60);
		vector.add(80);
		vector.add(90);
		vector.add(50);
		Enumeration enumerator=vector.elements();
		while(enumerator.hasMoreElements()) {
			Object value=enumerator.nextElement();
			System.out.println(value);
			//no remove method
		}

		


}
}
