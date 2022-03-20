package Function;

public class Std_Login {
	
	//Login	
	public boolean Lg_Login(String Lg_Std_Email, String Lg_Password, String Lg_Std_Faculty) {
		
		if(Lg_Std_Email.equals("gamunu25@gmail.com") && Lg_Password.equals("dews1") && Lg_Std_Faculty.equals("BM")) 
		{
			System.out.println("\nSuccessfully Login");
			return true;
		}else {
			
			System.out.println("\nInvalid Login!!!");
			return false;
		}	
	}

	//can't be not Null login fields
	public boolean feilds_notnull(String Lg_Std_Email, String Lg_Password, String Lg_Std_Faculty) {
	
	if(Lg_Std_Email != null && Lg_Password != null && Lg_Std_Faculty != null ) {
		
		System.out.println("\npass,no any null feilds");
		return true;
		
	}else {
		System.out.println("\nFelid are empty enter login details");
		return false;
		  }	
	}

}
