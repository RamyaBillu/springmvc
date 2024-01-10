package streams_Dec_12_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindingNumber {

	public static void main(String[] args) {
		List<String> value = new ArrayList<String>();
		value.add("vamsi");
		value.add("varun");
		value.add("vamsiKa");
		value.add("vamsiRaj");
		long count = value.stream().count();
		
		System.out.println(count);

	}

}
