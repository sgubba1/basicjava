
public class Milk {
	String milkbrand;
	Milk(String inputmilkbrand){
		inputmilkbrand = milkbrand;
	}
	void milkFinal(String quantity){
		pourmilk(quantity);
		drinkmilk(quantity);
	}
	
	private void pourmilk(String quantity){
		System.out.println("Pour "+ quantity + " cups of milk");
	}
	private void drinkmilk(String quantity){
			System.out.println("Drink "+ quantity + " of milk");
		
	}
}
