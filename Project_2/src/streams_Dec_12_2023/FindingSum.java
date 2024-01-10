package streams_Dec_12_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingSum {

	public static void main(String[] args) {
		List<Integer> value = new ArrayList<Integer>();
		value.add(1);
		value.add(2);
		value.add(3);
		value.add(4);
		value.add(5);

		System.out.println(value.stream().collect(Collectors.summingInt(e->e)));

	}

}
