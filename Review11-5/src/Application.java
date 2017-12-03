
public class Application {

	public static void main(String[] args) {
		Math M1 = new Math();
		int result = M1.absolutevalue(-4);
		System.out.println("Absolute value is " + result);
		int answer = M1.biggernumber(7, 9);
		System.out.println("Max number is " + answer);

	}
}
