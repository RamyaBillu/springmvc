package generics_NOV28;

import java.util.ArrayList;

public class GenericMethodClass<T> {

		/**
		 * GENERIC METHOD
		 * 
		 * @param <D>
		 * @param value1
		 * @param value2
		 */
//		public <D> void calculate(GenericClass<D> value1, GenericClass<D> value2) {
//
//		}

		/**
		 * GENERIC METHOD
		 * 
		 * @param <D>
		 * @param value1
		 * @param value2
		 */
		public   void calculate( ArrayList<? extends Number> value1) {
		}

		public static void main(String[] args) {

			GenericMethodClass klass = new GenericMethodClass();
			GenericClass<Integer> object1 = new GenericClass<>();
			GenericClass<Integer> object2 = new GenericClass<>();

			//klass.<Integer>calculate(object1, object2);
			//klass.<String>calculate("String1", "String2");

		}

   	}



