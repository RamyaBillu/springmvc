package streams_Dec_12_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomSum {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> randomNumber = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			randomNumber.add(random.nextInt(1000));
		}
		System.out.println(randomNumber);
		System.out.println("....................");
		randomNumber.stream().filter((num) -> isPrime(num)).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
