
public class NumberFunction {
//find limits of long
	public long outNumber = 0;
	public long reverse(long inNumber){
		while(inNumber > 0){
			long remainder = inNumber%10; //finding number in ones place
			outNumber = outNumber*10 + remainder; //adding to number
			inNumber = inNumber/10; //finds next number... new ones place
		}
		return outNumber;
	}
}
