
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student S1 = new Student("Bob");
int minutes = S1.Play(1);
System.out.println(minutes);

minutes = S1.play2(2);
System.out.println(minutes);

minutes = S1.play(Game.football);
System.out.println(minutes);



	}

}
