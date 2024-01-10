package lambda_dec11_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program3List {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Bangalore");
		list.add("bangkok");
		list.add("bangaladesh");
		list.add("tirupati");
		list.add("renigunta");
		Predicate<String> p=(T)->{
		if(list.contains(T)) {
			return true;
		}
		return false;
		

	};
	if(p.test("bangkok")) {
		System.out.println("String is available");
	}
	else System.out.println("not available");
	}

}

