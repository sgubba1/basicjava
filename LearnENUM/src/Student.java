
public class Student {
	void eatingfruit(int fruitType) {
		System.out.println("Time to eat a fruit.");
		// two equals means comparing while one equal sign is assigning a value
		// to variable
		if (fruitType == Fruit.Apple) {
			System.out.println("Eating apple.");
		} else if (fruitType == Fruit.Banana) {
			System.out.println("Eating banana.");
		} else if (fruitType == Fruit.Grape) {
			System.out.println("Eating grape.");
		} else {
			System.out.println("Eating an unknown fruit.");
		}

	}

	void eatingfruit(enumlearn.Fruit f) {
		System.out.println("Eating " + f);
	}

}
