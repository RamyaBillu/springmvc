package map_Dec_05_2023;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TableMapLinked {
	
	public static void main(String args[])
	{
	//Create LinkedHashMap Object
	LinkedHashMap<Integer,String> students = new LinkedHashMap<Integer,String>();
	//Add objects in LinkedHashMap
	students.put(1, "Jai");
	students.put(4, "Hemant");
	students.put(5, "Narender");
	students.put(2, "Mahesh");
	students.put(3, "Vishal");
	//Print LinkedHashMap objects
	for (Entry<Integer, String> entry : students.entrySet()) {
	System.out.println(entry.getKey() + " - " + entry.getValue());
	}
	System.out.println("===============================");
	
	
	//HashMap
	HashMap<Integer,String> student2 = new HashMap<Integer,String>();
	//Add objects in HashMap
	student2.put(1, "Jai");
	student2.put(4, "Hemant");
	student2.put(5, "Narender");
	student2.put(2, "Mahesh");
	student2.put(3, "Vishal");
	for (Entry<Integer, String> entry : student2.entrySet()) {
		System.out.println(entry.getKey() + " - " + entry.getValue());
		student2.remove(student2);
		}
	System.out.println("======================");
	Hashtable<Integer,String> student3 = new Hashtable<Integer,String>();
	student3.put(1, "Jai");
	student3.put(4, "Hemant");
	student3.put(5, "Narender");
	student3.put(2, "Mahesh");
	student3.put(3, "Vishal");
	for (Entry<Integer, String> entry : student3.entrySet()) {
		System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	
	}
	}


