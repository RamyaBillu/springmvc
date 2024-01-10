package map_Dec_05_2023;

import java.util.HashMap;
import java.util.Map;

public class WithoutKeys {

	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hello");
		map.put(2, "Welcome");
		System.out.println(map.values().toString());

	}

}
