package collections_NOV30;

import java.util.LinkedList;

public class CollectionToArray {

	public static void main(String[] args) {
		LinkedList<Integer>linkedList=new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		 Object[] obj=linkedList.toArray();
		 for(int i=0;i<obj.length;i++) {
			 System.out.println(obj[i]);
		 }

		

	}

}
