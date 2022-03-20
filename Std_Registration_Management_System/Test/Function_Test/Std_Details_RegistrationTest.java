package Function_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Function.Std_Details_Registration;
import Function.Std_Login;

public class Std_Details_RegistrationTest {

	
	//Test the Entering student Details
	@Test
	public void Std_Reg_Detailstest() {
		
		Std_Details_Registration Std_Reg_Details = new Std_Details_Registration();
		
		String F_name   = "Nisal"; 
		String M_name = "Seniya"; 
		String BOD = "02-05-1998" ;
		String P_number = "0755412268"; 
		String Email = "nisal@gmail.com";

		boolean actual = Std_Reg_Details.Std_Reg_Details(F_name, M_name, BOD, P_number, Email);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}

	//Compare First name and middle name because it can't be same,assert method of junit
	@Test
	public void Compare_FML_Nametest() {
		
		Std_Details_Registration Std_Reg_Details = new Std_Details_Registration();
		
		assertFalse(Std_Reg_Details.compare_FML_Name("Nisal", "Seniya"));
		
	}
	
	//phone number validation test
	@Test
	public  void Valid_PhonenNumtest() {
		
		Std_Details_Registration Std_Reg_Details = new Std_Details_Registration();
		
		assertTrue(Std_Reg_Details.valid_phone("0755412268"));
		
	}

	//Email Validation test
	@Test
	public void Std_Reg_Emailtest() {
		
		Std_Details_Registration Std_Reg_Details = new Std_Details_Registration();
		
		String Email = "nisal@gmail.com";

		boolean actual = Std_Reg_Details.valid_Email(Email);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}	
	
}
