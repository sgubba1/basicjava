
public class Student {
	String name;
	int age;
	int grade;
	int ssn;
	String address1;
	String phone;
	Student(String inputname, int inputage, int inputgrade, int inputssn, String inputaddress1, String inputphone) {
		inputname = name;
		inputage= age;
		inputgrade = grade;
		inputssn = ssn;
		inputaddress1 = address1;
		inputphone = phone;	
	}
	String register(){
		System.out.println("Registering as: " + name + " who is " + age + " years old and in grade " + grade + ". Lives at " + address1 + ". Contact at " + phone);
		return "Conformation code: 3456";			

	}
	
		
	}


