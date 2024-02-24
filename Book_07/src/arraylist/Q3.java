package arraylist;

public class Q3 {
	public static void main(String[] args) {
		int arr3[] = new int[] { 2, 4, 6, 8, 10 };
		int total = 0;
		for (int i = 0; i < arr3.length; i++) {
			total += arr3[i];
		}
		System.out.println(total);
	}
}