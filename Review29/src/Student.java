
public class Student {
	// 15th session
	String name;
	int age;

	Student(String inputname) {
		name = inputname;
		System.out.println(inputname);
	}

	Student(String inputname, int inputage) {
		name = inputname;
		age = inputage;
		System.out.println(inputname + " is " + inputage);
	}
	void readBook(String bookName){
		checkout(bookName);
		readingBook(bookName);
		checkin(bookName);
	}

	private void ReadBook(String bookName) {
	}

	private void checkout(String bookName) {
		System.out.println("Checking out book: " + bookName);
	}

	private void readingBook(String bookName) {
		System.out.println("Reading book: " + bookName);
	}

	private void checkin(String bookName) {
		System.out.println("Checking in: " + bookName);
	}


}
