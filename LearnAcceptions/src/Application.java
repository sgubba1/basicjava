
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student();
		try {
			System.out.println("borrow money.");
			S1.borrowMoney(-1);
			System.out.println("borrowed money successfully.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot borrow money");
	}

}
}
