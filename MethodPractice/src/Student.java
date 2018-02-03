
public class Student {
 
//method not taking any inputs and outputs
	void doHomework(){
		System.out.println("Doing hw.");
	}
//method taking one input no outputs
	void readBook(String bookName){
		System.out.println("Reading " + bookName);			
	}
	
//method taking 2 inputs and no outputs
	void readBook(String bookName, int minutesRead){
		System.out.println("Reading " + bookName + " for " + minutesRead + " minutes.");
	}
	
//method not taking any inputs but returning output
	int getNumberOfHoursPlayed(){
		return 10;
		
	}
//getNumberOfHoursPlayed
	int play(String gamename, int numberOfMinutesPlayed){
		return 10;
		
	}
}
