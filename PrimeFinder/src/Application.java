
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int count = 0;
		for (number = 2; number < 1000; number = number + 1) {
			boolean isNumberPrime = true;
			for (int divisor = 2; divisor <= Math.sqrt(number); divisor = divisor + 1) {
				if (number % divisor == 0) {
					isNumberPrime = false;
					break;
				}
			}
			if (isNumberPrime == true) {
				System.out.println(number + " is prime");
				count = count + 1;	
			}
		}
		System.out.println("Total number of primes " + count);
	}

}
