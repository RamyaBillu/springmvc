package lambda_dec11_2023;

import java.util.function.BiFunction;

public class TestCalculator {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> b=new Calculator()::add;
		System.out.println(b.apply(14, 15));

	}

}
