
public class Application {

	public static void main(String[] args) {
		int i;
		int tableNumber = 8;
		int tableCount = 5;
		for (i = 1; i <= tableCount; i = i + 1) {
			int result = i * tableNumber;
			System.out.println(tableNumber + "*" + i + "=" + result);
		}
		 Student s1 = new Student();
         s1.readBook("Harry Potter");        // ask student to read "Harry potter"
         s1.readBook("Harry Potter", 30);    // ask student to read "Harry potter" for 30 minutes.
         s1.readBook("Harry Potter", 30, 20);    // read "Harry Potter" for 30mintes and 20 pages.
         s1.readBook();      // choice of book, minutes, pages.
     }
 }




