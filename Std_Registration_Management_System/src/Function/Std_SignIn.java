package Function;

public class Std_SignIn {
	
	//SignIn 
	public boolean signin(String Full_Name, String Std_Tem_ID, String Std_Email, String Password, String Reenter_pwd,String Std_Faculty) {
		
		if(Full_Name.equals("Sujani Chathurika De Silva") && Std_Tem_ID.equals("0045IT") && Std_Email.equals("chathusujani57@gmail.com") 
				&& Password.equals("*784wsa") && Reenter_pwd.equals("*784wsa") && Std_Faculty.equals("BM")) 
		{
			 System.out.println("\nSuccessfully SignIn!!!!");
			return true;
		}else {
			System.out.println("\nInvalid Details!!!,Check Entered Details Again");
			return false;
		}	
	}
	
  
	//Compare Entered password and reentered password are correct
	public boolean comparepassword( String Password, String Reenter_pwd) {
			 
		if (Password.equals("*784wsa") && Reenter_pwd.equals("*784wsa") )
		{
			System.out.println("\nEntered password and reentered password is correct");
			return true;
		} 
		else{		
			System.out.println("\nEntered password and reentered password is incorrect,Check the reentered password Again!!");
			return false;	
			}
	}	
}
