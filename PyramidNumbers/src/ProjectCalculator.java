
public class ProjectCalculator {
	static int total = 0;
	
	static int calc(int number){
	
	for(int pyramid = number;pyramid>0;pyramid=pyramid-1){
		total = total + pyramid;
		System.out.println(total);
	}
	return total;
	}
}
