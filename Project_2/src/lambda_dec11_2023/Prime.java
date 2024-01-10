package lambda_dec11_2023;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Prime {

	public static void main(String[] args) {
		
				BiFunction<Integer, Integer, Integer> biFunction=(value1,value2)->{
					int sum=0;
					for(int index1=value1;index1<=value2;index1++) {
						int count=0;
						for(int index2=2;index2<=index1/2;index2++) {
							if(index1%index2==0) {
								count++;
							}
						}
						if(count==0) {
							sum+=index1;
						}
					}
					return sum;
					
				};
				System.out.println(biFunction.apply(20, 30));
			}
}

		
	
		

			
		
	
	
	



