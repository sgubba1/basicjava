
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int[] primes = new int[1000000];
		primes[0] =2;
		int count = 1;
		long startTime = System.currentTimeMillis();
		for (number = 3; count < 1000000; number = number + 1) {
			boolean isNumberPrime = true;
			for (int primeindex = 0; primes[primeindex] < Math.sqrt(number); ++primeindex) {
				if (number % primes[primeindex] == 0) {
					isNumberPrime = false;
					break;
				}
			}
			if (isNumberPrime == true) {
				System.out.println(number + " is prime");
				count = count + 1;
				primes[count-1]= number;


			}
		}
		System.out.println(count);
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)+ " milliseconds taken for run");
	}

}
