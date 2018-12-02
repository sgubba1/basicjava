
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String student1 = School.register("Bob", 13, 123456, 8, "33133 NW ALLEN BLVD", "5035460765");
		System.out.println(student1);
		
		Student S1 = new Student("Tammy", 15,10,345678, "4415 SW MURRAY BLVD", "9713567878");
		String student2 = S1.register();
		System.out.println(student2);
		
		Person p = new Person("Me");
		p.print();
	}

}
