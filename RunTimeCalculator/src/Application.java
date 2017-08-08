import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Enter number of laps ran.");
		Scanner scanner = new Scanner(System.in);
		int laps = scanner.nextInt();

		double totalTime = 0;
		for (int i = 1; i <= laps; i = i + 1) {
			System.out.println("Enter time for lap " + i + " in minutes.");
			double timeFortheLap = scanner.nextDouble();
			totalTime = timeFortheLap + totalTime;
		}
		System.out.println("Total time is " + totalTime + " minutes.");

		scanner.close();
		//scanner.close ends the scanner so the yellow alert is gone..
	}

}
