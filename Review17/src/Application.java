
public class Application {

	public static void main(String[] args) {
		String name;
		int age;
		name = "Srinidhi";
		age = 12;
		System.out.println(name + " " + age);

		Math M1 = new Math();
		int result = M1.add(-8, 1000); 
		System.out.println(result);
		// only need to define once
		 result = Math.add(2, 3);
		 System.out.println(result);
		result= Math.add(1000, 2);
		System.out.println(result);

	}
}
