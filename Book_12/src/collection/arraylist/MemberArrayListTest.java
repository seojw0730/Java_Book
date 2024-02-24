package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member Lee = new Member(1001, "이지원");
		Member Son = new Member(1002, "손민국");
		Member Park = new Member(1003, "박서훤");
		Member Hong = new Member(1004, "홍길동");

		memberArrayList.addMember(Lee);
		memberArrayList.addMember(Son);
		memberArrayList.addMember(Park);
		memberArrayList.addMember(Hong);

		memberArrayList.showAllMember();

		memberArrayList.removeMember(Hong.getMemberId());
		memberArrayList.showAllMember();

	}
}
