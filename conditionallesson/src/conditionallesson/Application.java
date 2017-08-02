package conditionallesson;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 12;

		if( age > 18)	{
			System.out.println("you are major");
			System.out.println("you can enter");
		}else if( age == 18) {
			System.out.println("your almost there");
		}
		else {
			System.out.println("you are minor");
			System.out.println("sorry");
		}
	}
	
}
