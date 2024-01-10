package threads_Dec_6_2023;

import java.util.function.Function;
import java.util.function.Predicate;

public class CheckEvenNum  {



	public static void main(String[] args) {
	 Predicate<Integer> predicate=(t)->{
			if(t%2==0) {
				return true;
			}
		
		return false;
	};
	System.out.println(predicate.test(120));
//		Double d = num.apply(18.5);
//		System.out.println(d);
		
		

	}
}

	
