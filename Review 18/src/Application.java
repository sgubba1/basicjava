
public class Application {

	public static void main(String[] args) {
		int result = Math.add(8, 100);
		System.out.println(result);

		result = Math.add(500, -4);
		System.out.println(result);

		Math M1 = new Math();
		int resultSpecial = M1.addSpecial(7);
		System.out.println(resultSpecial);
		resultSpecial = M1.addSpecial(6);
		System.out.println(resultSpecial);
		resultSpecial = M1.addSpecial(5);
		System.out.println(resultSpecial);

		Math M2 = new Math();
		resultSpecial = M2.addSpecial(2);
		System.out.println(resultSpecial);
		resultSpecial = M2.addSpecial(3);
		System.out.println(resultSpecial);
		resultSpecial = M2.addSpecial(4);
		System.out.println(resultSpecial);
		
		Dog D1 = new Dog();
		D1.feed();
	}
	
}
