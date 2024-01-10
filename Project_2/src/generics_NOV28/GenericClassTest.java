package generics_NOV28;

public class GenericClassTest {


		public static void main(String[] args) {

			GenericClass<Integer> genericKlass = new GenericClass<>();
			// genericKlass.setName("string");
			genericKlass.setName(100);
			System.out.println(genericKlass.getName());

		}

	}



