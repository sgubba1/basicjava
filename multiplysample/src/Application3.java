

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		//lets say user entered 5
		// 5 * 1 = 5
		// 5 * 2 = 10
		// 5 * 3 = 15
		// ...
		// 5 * 10 = 50
		
		int i;
		for (i=1;i<=10; i=i + 1) {
			int result = number * i;
			System.out.println(result);
			
		}
	}

}
