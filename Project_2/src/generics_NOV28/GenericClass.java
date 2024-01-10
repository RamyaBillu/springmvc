package generics_NOV28;

public class GenericClass<D> implements Comparable {

	/**
	 * 
	 * GENERIC CLASS
	 *
	 * @param <D>
	 */

		private D name;

		private D location;

		public D getName() {
			return name;
		}

		public void setName(D name) {
			this.name = name;
		}

		public D getLocation() {
			return location;
		}

		public void setLocation(D location) {
			this.location = location;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

	}



