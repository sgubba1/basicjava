
public class Study {
	String testname;

	Study(String inputtestname) {
		inputtestname = testname;
	}

	void studyTest(String testname) {
		reviewnotes(testname);
	}

	private void reviewnotes(String testname) {
		System.out.println("Review assignments and notes for: " + testname);
	}

}
