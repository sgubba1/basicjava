
public class StringFunctions {
public String reverse(String instring){
	char[] letters = instring.toCharArray();
		int lastIndex = letters.length-1;
		for(int position = 0; position < lastIndex/2; position++){
			char temp = letters[lastIndex-position];
			letters[lastIndex - position] = letters[position];
			letters[position] = temp;
		}
	return new String(letters);
	
}
}
