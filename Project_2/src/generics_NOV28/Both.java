package generics_NOV28;

// Generic interface
interface Pair<K> {
	K getKey();
}

// Generic class implementing the generic interface
class OrderedPair<K> implements Pair<K> {
	private K key;

	public OrderedPair(K key) {
		this.key = key;
	}

	@Override
	public K getKey() {
		return key;
	}

}

public class Both {
	public static void main(String[] args) {
		// Creating an OrderedPair with String and Integer types
		Pair<String> pair1 = new OrderedPair<>("One");
		System.out.println("Key: " + pair1.getKey());

		// Creating an OrderedPair with Double and String types
		Pair<Double> pair2 = new OrderedPair<>(4.78);
		System.out.println("Key: " + pair2.getKey());
	}
}
