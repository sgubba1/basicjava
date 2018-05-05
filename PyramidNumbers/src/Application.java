
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10; 
		int total = 0;
		for (int pyramid = number; pyramid > 0; pyramid = pyramid - 1) {
			total = total + pyramid;
			//no need to do a loop in a loop
			System.out.println(total);
			//hw: loop with 3x+4 equation, first 10 points
			//crc thingamabob
		}
	}

}
