import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		System.out.print("second number:");
		int secondNumber = scanner.nextInt();
		
		System.out.println(firstNumber + secondNumber);
	}
	}


