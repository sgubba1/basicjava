package minmaxsample;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please give first number");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		System.out.println("please give second number");
		scanner = new Scanner(System.in);
		int secondNumber = scanner.nextInt();
		
		// 10,20 (minimum 10, maximum 20)
		// pseudo
		
	if(firstNumber<secondNumber){
		System.out.println("Min is firstNumber.");
		System.out.println("Max is secondNumber.");
	}
	
	else if(secondNumber<firstNumber){
		System.out.println("Min is secondNumber.");
		System.out.println("Max is firstNumber.");
	}
		

	}

}
