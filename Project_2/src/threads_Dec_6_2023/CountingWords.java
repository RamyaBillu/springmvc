package threads_Dec_6_2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountingWords {

	public static void main(String[] args) {
		String str = "Core nuts technologies located in Bangalore "
				+ "Core nuts technologies located in hyderabad "
				+ "Core nuts technologies in Hyderabad"
				+ " Core nuts technologies in Bangalore";
		String[] s = str.split(" ");
		Map<String,Integer>map=new HashMap();
		for(int i=0;i<s.length;i++) {
			if(map.containsKey(s[i])) {
				int count2=map.get(s[i]);
				map.put(s[i],++count2);
			}
			else
			{
				map.put(s[i], 1);
			}
		}
	System.out.println(map.entrySet());
}
				
			
		}
	

		
		
