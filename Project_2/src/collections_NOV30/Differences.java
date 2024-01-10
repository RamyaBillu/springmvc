package collections_NOV30;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Vector;
	public class Differences {



	    public static void main(String[] args) {
	        // ArrayList Example
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        System.out.println("ArrayList: " + arrayList);

	        // Vector Example
	        List<String> vector = new Vector<>();
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Orange");
	        System.out.println("Vector: " + vector);

	        // LinkedList Example
	        List<String> linkedList = new LinkedList<>();
	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");
	        System.out.println("LinkedList: " + linkedList);

	        // Common Operations
	        System.out.println("\nCommon Operations:");

	        // Adding an element at a specific index
	        arrayList.add(1, "Grapes");
	        vector.add(1, "Grapes");
	        linkedList.add(1, "Grapes");

	        // Removing an element
	        arrayList.remove("Banana");
	        vector.remove("Banana");
	        linkedList.remove("Banana");

	        // Iterating through the list
	        System.out.println("ArrayList after modifications: " + arrayList);
	        System.out.println("Vector after modifications: " + vector);
	        System.out.println("LinkedList after modifications: " + linkedList);

	        // Displaying list sizes
	        System.out.println("\nList Sizes:");
	        System.out.println("ArrayList Size: " + arrayList.size());
	        System.out.println("Vector Size: " + vector.size());
	        System.out.println("LinkedList Size: " + linkedList.size());
	    }
	}



