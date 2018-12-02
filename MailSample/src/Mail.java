
public class Mail {
	int id;
// constructor
	// class variable id: constructor, mail object,
	Mail(int id) {
		this.id = id;
	}
		void sendMail(String To, String Subject, String Body) {
		
		System.out.println("Send mail to: " + this.id);
	}

	void receiveMail() {
		
		System.out.println("Receive mail for: " + this.id);

	
	}
}
