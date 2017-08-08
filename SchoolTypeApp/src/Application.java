import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Grade Level.");
		Scanner scanner = new Scanner(System.in);
		int Number = scanner.nextInt();
		
		if(Number < 5){
			System.out.println("You are in elementary school.");
		}
	
	    else if(Number >= 6 && Number <= 8 ){
	    	System.out.println("You are in middle school.");
	    }
		
	    else if(Number >= 9 && Number <= 12){
	    	System.out.println("You are in high school."); 	
	    }
	    else
	    	System.out.println("You are in college.");
		
	
		
	}

}
