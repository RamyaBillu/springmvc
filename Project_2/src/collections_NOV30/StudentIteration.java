package collections_NOV30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIteration {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Student("ram",19));
		list.add(new Student("vamsi",20));
		list.add(new Student("prashanth",20));
		for(Object value:list) {
			System.out.println(value);
			
		}
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
//		List list1=new ArrayList();
//		list1.add(1);
//		list1.add(2);
//		list1.add("ramya");
//		list1.add("madhura");
//		int sum=0;
//		for(int i=0;i<list1.size();i++) {
//			if(list1.get(i)instanceof Integer) {
//				sum+=(int)list1.get(i);
//			}
//		}
//		System.out.println(sum);
//
//		}
//			
//		}
//
//		
//		
//
//	


