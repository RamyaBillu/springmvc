package collectionsPart_2_Dec_4_2023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashsetAndLinkedHashSet {
	     public static void main(String args[]){    
	            LinkedHashSet<Integer> lh=new LinkedHashSet(); // Implementing HashSet     
	                   lh.add(10);    // Adding elements  
	                   lh.add(20);      
	                   lh.add(30);     
	                   lh.add(40);
	                   
	                   lh.add(null);
	                   lh.add(50);    
	                   Iterator<Integer> i=lh.iterator(); // Traversing objects    
	                   while(i.hasNext()) // Return true if the Scanner has another token input    
	                   {    
	                   System.out.println(i.next());// printing elements     
	                   } 
	                   System.out.println("====================");
	                   HashSet<Double> hashset=new HashSet();  // Implementing HashSet  
	                   hashset.add( 20.300);    //Adding elements  
	                   hashset.add(30.67);      
	                   hashset.add(40.56);     
	                  
	                   Iterator<Double> iterator=hashset.iterator();  // Traversing objects  
	                   while(iterator.hasNext())  // Return true if the Scanner has another token input  
	                   {    
	                   System.out.println(iterator.next()); // printing elements   
	                   }    
	         }    

	     }    

