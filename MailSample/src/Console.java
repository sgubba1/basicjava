import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1 = new Scanner(System.in);
		System.out.println("Please enter username:  ");
		String username = S1.nextLine();
		System.out.println("Please enter password: ");
		String password = S1.nextLine();
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
		
		Account a1 = new Account();
		int ID = a1.login(username,password);
		
	}

}
