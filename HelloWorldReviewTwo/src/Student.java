
public class Student {
	String name;
	int grade;
	String bookName;
	int minutesRead;


	void printInfo() {
		System.out.println("Name is " + name);
		System.out.println("Grade is " + grade);
	}
	void doHomework() {
		System.out.println( name +" is doing homework like a good student..");
	}
	int readBook(String bookName) {
		System.out.println("It took " + minutesRead + " minutes to read " + bookName);
		return minutesRead;
	}
		Student(String inputname, int inputgrade) {
		name = inputname;
		grade = inputgrade;
	}

}
