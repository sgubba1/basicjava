
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car C1 = new Car();
		C1.name = "Ferrari";
		C1.power = 200;
		
		Car C2 = new Car();
		C2.name = "Mercedes Benz";
		C2.power = 150;

		Car C3 = new Car();
		C3.name = "Toyota";
		C3.power = 100;
		

		C1.start();
		C1.start();
		C1.stop();
		System.out.println("It has " + C1.power + " horse power.");
		
		
		C2.start();
		C2.stop();
		System.out.println("It has " + C2.power + " horse power.");
		
		C3.start();
		C3.stop();
		System.out.println("It has " + C3.power + " horse power.");
		

	}

}
