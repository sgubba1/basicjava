
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student();
		S1.eatingfruit(Fruit.Apple);

		Student S2 = new Student();
		S2.eatingfruit(Fruit.Banana);

		Student S3 = new Student();
		S3.eatingfruit(Fruit.Grape);
		
		Student S4 = new Student();
		S4.eatingfruit(enumlearn.Fruit.Grape);
		
		Student S5 = new Student();
		S5.eatingfruit(enumlearn.Fruit.Pineapple);
	}

}
