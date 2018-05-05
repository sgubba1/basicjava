
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int count = 0;
		long startTime = System.currentTimeMillis();
		for (number = 2; count < 1000; number = number + 1) {
			boolean isNumberPrime = true;
			for (int divisor = 2; divisor <= Math.sqrt(number); divisor = divisor + 1) {
				//do square root so the numbers switch (like factors of ten --> 1*10,2*5,5*2, etc.. it is repeated
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
		System.out.println(count);

		long endTime = System.currentTimeMillis();
		// current time has bbeen recorded in milliseconds since 1970: do start and end time to see how much time has past
		System.out.println((endTime - startTime) + " milliseconds taken for run");
	}
//with square root  -> 1000 prime numbers = 31 milliseconds : without -> 65 milliseconds
}
