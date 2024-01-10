package collectionsPart_2_Dec_4_2023;
import java.util.HashSet;
import java.util.TreeSet;


public class DifferenceHashAndTree {

		public static void main(String[] args)
		{
			// Create an empty TreeSet
			TreeSet<String> tset = new TreeSet<String>();

			// Adding elements to HashSet
			// using add() method
			tset.add("varshini");
			tset.add("is");
			tset.add("a");
			tset.add("friend");

			// Duplicate elements being removed
			tset.add("varshini");

			// Displaying TreeSet elements
			System.out.println("TreeSet contains: ");
		
			for (String temp : tset) {
				System.out.println(temp);
			}
			// Java Program to Demonstrate Working of HashSet Class

				
					// Creating a HashSet object of string type
					HashSet<String> hset = new HashSet<String>();

					// Adding elements to HashSet
					// using add() method
					hset.add("varshini");
					hset.add("is");
					hset.add("a");
					hset.add("friend");

					// Duplicate removed
					hset.add("varshini");

					// Printing HashSet elements using for each loop

					// Display message only
					System.out.println("HashSet contains: ");

					// Iterating over hashSet using for-each loop
					for (String temp : hset) {

						// Printing all elements inside above hashSet
						System.out.println(temp);
					}
				}
			

		}
	



