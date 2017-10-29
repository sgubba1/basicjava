
public class Application {

	public static void main(String[] args) {
		
		Student Tanvi = new Student("Tanvi",7);
		Tanvi.printInfo();
		Tanvi.doHomework();
		Tanvi.minutesRead = 10;
		int minutesRead = Tanvi.readBook("Harry Potter");
		Student Bukka = new Student("Bukka",6);
		Bukka.printInfo();
		Bukka.doHomework();

				
		}
	}