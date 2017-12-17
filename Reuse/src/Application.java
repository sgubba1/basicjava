import java.time.YearMonth;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		// extend = is a
		Student S1 = new Student();
		S1.grade();
		S1.grading = 'A';
		S1.attendance();
		S1.id(396697);
		System.out.println(S1.id);

		double root = Math.sqrt(4);
		System.out.println(root);
		
		double log = Math.log10(1000.0);
		System.out.println(log);
		
		Date now = new Date();
		System.out.println(now);
		
		YearMonth y = YearMonth.of(1900, 5);
		System.out.println(y.lengthOfMonth());
	}

}
