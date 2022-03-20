package Function_Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Function.Std_SignIn;

public class SignInTest {


	//Test the signIn
	//Test the SignIn Entered Details
	@Test
	public void SignIntest() {
		
		Std_SignIn signin = new Std_SignIn();
		
		String Full_Name = "Sujani Chathurika De Silva"; 
		String Std_Tem_ID = "0045IT"; 
		String Std_Email = "chathusujani57@gmail.com";
		String Password = "*784wsa"; 
		String Reenter_pwd = "*784wsa";
	    String Std_Faculty = "BM";
		
		boolean actual = signin.signin(Full_Name,Std_Tem_ID,Std_Email,Password,Reenter_pwd,Std_Faculty);
		boolean expected = true;
		
		assertEquals(expected, actual);


	}
	
	
	//Test the signIn
	//Test the SignIn Entered Details
	@Test
	public void Validate_SignIntest() {
		
		Std_SignIn signin = new Std_SignIn();
		
		String Full_Name = "Nisal Seniya Dilshan"; 
		String Std_Tem_ID = "0074BM"; 
		String Std_Email = "snisal@gmail.com";
		String Password = "qwas2"; 
		String Reenter_pwd = "was2";
		String	Std_Faculty = "IT";
		
		boolean actual = signin.signin(Full_Name,Std_Tem_ID,Std_Email,Password,Reenter_pwd,Std_Faculty);
		boolean expected = false;
		
		assertEquals(expected, actual);
	
	}
	

	//Assert method in Junit
	//check the entered password and reenter password are correct
	@Test
	public void comparepassword() {
				
			Std_SignIn signin = new Std_SignIn();
			
			assertTrue(signin.comparepassword( "*784wsa", "*784wsa"));
	
	}
	
}
