package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("임");
		hashSet.add("박");
		hashSet.add("홍");
		hashSet.add("강");
		hashSet.add("강");

		System.out.println(hashSet);
	}
}
