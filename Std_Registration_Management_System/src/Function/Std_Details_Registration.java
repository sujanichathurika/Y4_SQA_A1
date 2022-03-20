package Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class Std_Details_Registration {
	
	//Enter Details
	public boolean Std_Reg_Details(String F_name, String M_name, String BOD,String P_number, String Email ) {
		
		if(F_name.equals("Nisal") && M_name.equals("Seniya") && BOD.equals("02-05-1998") && P_number.equals("0755412268") && Email.equals("nisal@gmail.com")) {	
			
			System.out.println("\nSuccessfully Submit");
			return true;
		}
		else {
			System.out.println("\nStudent Details did not submit!!,Check the details again");
			return false;
		}	
	}
	
	//First,Middle,Last name comparison
	public boolean compare_FML_Name(String F_name, String M_name) {
		
		if(F_name.equalsIgnoreCase(M_name)) {
			
			System.out.println("\n!!!First name and middle name can't be same!!!");
			return true;
		}
		else {
			System.out.println("\nPerfect Name");
			return false;
		}	
	}
	
	//Phone number validation
	public static boolean valid_phone(String P_number) {
		
		if(P_number.matches("0-9") || P_number.length() == 10)
		{
			
			System.out.println("\nValid Phone Number");
			return true;
		}
		else {
			System.out.println("\n!!!Invalis Phone Number!!!,Check Again");
			return false;
		}	
	}
	
	//Email Validation
	public static boolean valid_Email(String Email) {
	
		if(Email.contains("@") && Email.endsWith(".com"))
		{
			System.out.println("\nValid Email ");
			return true;
		}
		else {
			System.out.println("\n!!!Invalid Email!!!,Check Again");
			return false;
		}
	}
	
}

	