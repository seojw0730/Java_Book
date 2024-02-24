package arraylist;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {

		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("1", "11"));
		list.add(new Dog("2", "11"));
		list.add(new Dog("3", "11"));
		list.add(new Dog("4", "11"));
		list.add(new Dog("5", "11"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}

		for (Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}

}
