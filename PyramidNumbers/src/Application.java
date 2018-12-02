
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int x = 3; x <= 10; x++) {
			int pattern = x;
			System.out.println(pattern + "," + ProjectCalculator.calc(pattern));
		}

		for (int n = 1; n <= 5; n++) {
			int y = 4 * n + 3;
			System.out.println(n + "," + y);
		}
		LineCalculator L1 = new LineCalculator(4, 3);
		for (int n = 1; n <= 3; n++) {
			int Y = L1.getYCoordinate(n);
			System.out.println(n + "," + Y);
		}

		LineCalculator L2 = new LineCalculator(5, 2);
		int y = L2.getYCoordinate(2);
		System.out.println(2 + "," + y);

	}

}
