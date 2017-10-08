
public class Car {
	// no input
	// no output
	String name;
	int horsepower;
	boolean isStarted = false; // indicate if whether started or not
	
	void start() {
		if(isStarted == false) {
		System.out.println("Starting the " + name + " with " + horsepower + " horsepower."); }
		
		else {
			System.out.println("Sry! You already started the car. Stop it to start again..");
		}
	}

	//no input
	// no output
	void stop() {
		System.out.println("Stopping the " + name );
		if(isStarted == true){
			System.out.println("Stopping: " + name);
		}else{
			System.out.println("Sorry, you need to start the car before stopping it." );
		}
	}	
	}
	
