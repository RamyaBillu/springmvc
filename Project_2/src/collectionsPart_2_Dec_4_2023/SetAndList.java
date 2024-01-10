package collectionsPart_2_Dec_4_2023;
import java.io.*;
import java.util.*;



public class SetAndList {
	// Implementation of List and Set in Java
	

		public static void main(String[] args)
		{
			// List declaration
			List<Integer> l = new ArrayList<>();
			l.add(5);
			l.add(6);
			l.add(3);
			l.add(5);
			l.add(4);

			// Set declaration
			Set<Integer> s = new HashSet<>();
			s.add(5);
			s.add(6);
			s.add(3);
			s.add(5);
			s.add(4);

			// printing list
			System.out.println("List = " + l);
			// printing Set
			System.out.println("Set = " + s);
		}
	

}
