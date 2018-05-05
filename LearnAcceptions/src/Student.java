
public class Student {
	//creates exception, and lets it be used by typing in method
	void borrowMoney(int amount) throws Exception {
		System.out.println("I am borrowing the money");
		
		if(amount <= 0){
			Exception amountless = new Exception("This amount is less than 0. Not valid.");
			//look at what happens when u hover over exception, and do ctrl + space -> parameters
			throw amountless;
		}
		else if(amount >= 100){
			Exception amountmore = new Exception("I do not have more than 100, so I cannot accept.");
			throw amountmore;
		}
		else{
			
		}
	}
}
