package generics_NOV28;

import java.util.ArrayList;

public class GenTest {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		// list.add(new Person());

		GenTest genTest = new GenTest();

		genTest.display(list);

	}

	private void display(ArrayList<Integer> list) {

//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}

//			list.add(11);
//			list.toArray();

		for (Object obj : list) {
			Integer value = (Integer) obj;
			System.out.println(value);
		}

	}

}
