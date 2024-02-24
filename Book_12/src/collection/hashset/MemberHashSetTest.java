package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member Lee = new Member(1001, "이지");
		Member Son = new Member(1002, "손민");
		Member Park = new Member(1003, "박서");

		memberHashSet.addMember(Lee);
		memberHashSet.addMember(Son);
		memberHashSet.addMember(Park);
		memberHashSet.showAllMember();

		Member Hong = new Member(1003, "홍길");
		memberHashSet.addMember(Hong);
		memberHashSet.showAllMember();

	}
}
