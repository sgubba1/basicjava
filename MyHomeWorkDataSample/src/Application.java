
public class Application {

	public static void main(String[] args) {
	System.out.println("Shirt description:");
	
	Shirt S1 = new Shirt();
	S1.material = "Cotton";
	S1.size = "Medium";
	S1.cost = 12.5;
	
	System.out.println("Shirt material is " + S1.material);
	System.out.println("Shirt size is " + S1.size);
	System.out.println("Shirt cost is" + S1.cost);
	
	Shirt S2 = new Shirt();
	S2.material = "Silk";
	S2.size = "Small";
	S2.cost = 34;
	
	System.out.println("Shirt material is " + S2.material);
	System.out.println("Shirt size is " + S2.size);
	System.out.println("Shirt cost is" + S2.cost);
	
	
		

	}

}
