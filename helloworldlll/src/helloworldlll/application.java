package helloworldlll;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		int number = 4;
		if (number % 2 == 0) {
			System.out.println(number + " : Even number");
		} else {
			System.out.println(number + " : Odd number");
		}
			Person p1 = new Person();
			p1.name = "bobbette";
			p1.age = 17;

			Person p2 = new Person();
			p2.name = "Buddiot";
			p2.age = 3;
			int minutes = (p2.readBook("BFG")+ p2.readBook("BFG")+p2.readBook("BFG")+p2.readBook("BFG"));
			System.out.println( minutes + " minutes");
			if(minutes>= 60){
				System.out.println("You get an A");
			}
			else{
				System.out.println("You get a B");
			}
// hw: call readbook 4 times -- total how many minutes he read
		}

	}

