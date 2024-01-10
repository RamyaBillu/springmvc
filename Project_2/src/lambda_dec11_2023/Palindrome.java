package lambda_dec11_2023;

import java.util.function.Predicate;

public class Palindrome {

	public static void main(String[] args) {
		String s = "ramar";
		
		
		Predicate<String> p = (T) -> {
			String s1 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s1 += s.charAt(i);
			}
			if (s1.equals(T)) {
				return true;
			}
			return false;

		};
		if (p.test(s))
			System.out.println("palindrome");

		else
			System.out.println("not a pailndrome");
	}
}
