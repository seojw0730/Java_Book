package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길");
		treeSet.add("강감");
		treeSet.add("이순");

		for (String str : treeSet) {
			System.out.println(str);
		}
	}
}
