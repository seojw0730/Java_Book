package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member Park = new Member(3, "박");
		Member Lee = new Member(1, "이");
		Member Son = new Member(2, "손");

		memberTreeSet.addMember(Park);
		memberTreeSet.addMember(Lee);
		memberTreeSet.addMember(Son);
		memberTreeSet.showAllMember();

		Member Hong = new Member(3, "홍");
		memberTreeSet.addMember(Hong);
		memberTreeSet.showAllMember();
	}
}
