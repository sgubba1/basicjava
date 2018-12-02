
public class Account {
 
	int login(String userName, String passWord){
		
		if( userName.equals("Bill") && passWord.equals("9977")){
		
            return 1;
        }else if(userName.equals("Joe") && passWord.equals("6677")){
            return 2;
        }	
		return 0;
	}
	void logout(int UserId){
		
	}
}
