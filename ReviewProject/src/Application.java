
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.firstName = "Srinidhi";
		p1.lastName = "Gubba";
		p1.mobilePhone = "5035332714";
		p1.homePhone = "9712867324";
		
		System.out.println("Person info: " + p1.firstName +" " + p1.lastName);
		System.out.println("Person's phone numbers are " + p1.mobilePhone + " and " + p1.homePhone);

		p1.callingMobile();
		p1.callingHome();
		
	}

}
