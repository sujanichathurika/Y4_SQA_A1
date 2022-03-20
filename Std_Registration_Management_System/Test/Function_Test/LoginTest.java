package Function_Test;

import static org.junit.Assert.*;


import org.junit.Test;

import Function.Std_Login;
import Function.Std_SignIn;

public class LoginTest {

	

	//Test the Login
	//Test the Login Details
	@Test
	public void Logintest() {
		
		Std_Login Lg_Login = new Std_Login();

		String Std_Email = "gamunu25@gmail.com";
		String Password = "dews1"; 
		String Std_Faculty = "BM";
		
		boolean actual = Lg_Login.Lg_Login(Std_Email,Password,Std_Faculty);
		boolean expected = true;
		
		assertEquals(expected, actual);

	}
	
	
	//Test the  Login Validation
	@Test
	public void Validate_Logintest() {
		
		Std_Login Lg_Login = new Std_Login();
	
		String Std_Email = "gg25@gmail.com";
		String Password = "14dew"; 
		String Std_Faculty = "IT";	
		
		boolean actual = Lg_Login.Lg_Login(Std_Email,Password,Std_Faculty);
		boolean expected = false;
		
		assertEquals(expected, actual);

		}


	//Test the login fields not null 
	//Assert methods in junit
	@Test
	public void Login_Feildsnot_nulltest() {
		
		Std_Login Lg_Login = new Std_Login();
	
		String Std_Email = null;
		String Password = null; 
		String Std_Faculty = null;
		
		boolean actual = Lg_Login.feilds_notnull(Std_Email,Password,Std_Faculty);
		boolean expected = true;
		
		assertNotNull(Std_Email,Password,Std_Faculty);

		}
	private void assertNotNull(String std_Email, String password, String std_Faculty) {
		
	}
	
}
