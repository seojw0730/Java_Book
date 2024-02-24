package arraylist;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("1","11");
		dogArray[1] = new Dog("2","22");
		dogArray[2] = new Dog("3","33");
		dogArray[3] = new Dog("4","44");
		dogArray[4] = new Dog("5","55");

		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}

		for (Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
