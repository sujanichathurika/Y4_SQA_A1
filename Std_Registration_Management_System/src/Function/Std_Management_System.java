package Function;


import java.util.Scanner;

public class Std_Management_System {
	
	public static void main(String[] args) {
		
		
		 //imports
		 Scanner input = new Scanner(System.in);
		 Std_SignIn newSignIn = new Std_SignIn();
		 Std_Login newLogin = new Std_Login();
		 Std_Details_Registration newStd_Details_Registration = new Std_Details_Registration();
		 
		 //system name
		 System.out.println("\nSTUDENT REGISTRATION MANAGEMENT SYSTEM\n");
		 System.out.println("*******************************************");
		 
		 //Get student SignIn
		 System.out.println("Enter Your Details for Sign In,\n");
		 
		 System.out.println("Enter Your Full Name:");
		 String Full_Name = input.nextLine();
		 
		 System.out.println("Enter Your Student Tempory ID:");
		 String Std_Tem_ID = input.nextLine();
		 
		 System.out.println("Enter Your Personl Email:");
		 String Std_Email = input.nextLine();
		 
		 System.out.println("Enter Password:");
		 String Password = input.nextLine();
		 
		 System.out.println("ReEnter Password:");
		 String Reenter_pwd = input.nextLine();
		 
		 System.out.println("Enter your Faculty:(BM- Business Management/ IT- Information Technology/ EN - Engineering)");
		 String Std_Faculty = input.nextLine();
		 
		 
		 //Signin Student Validations
		 boolean enterdetails = newSignIn.signin(Full_Name,Std_Tem_ID,Std_Email,Password,Reenter_pwd,Std_Faculty);
		 
		 //compare entered password validation
		 boolean comparepassword = newSignIn.comparepassword(Password, Reenter_pwd);
		 
		 if(!enterdetails) {
			 //System.out.println("Invalid Details!!!,Check Entered Details Again");
		 }else {
			 
			 //System.out.println("Successfully SignIn!!!!");
		 }

		 System.out.println("*******************************************\n");
		 System.out.println("\n\n*******************************************");
		 
		 //Get student Login
		 System.out.println("Enter Login Details,\n");
		 
		 System.out.println("Your Email:");
		 String Lg_Std_Email = input.nextLine();
		 
		 System.out.println("Enter Password:");
		 String Lg_Password = input.nextLine();
		 
		 System.out.println("Enter Faculty:(BM- Business Management/ IT- Information Technology/ EN - Engineering)");
		 String Lg_Std_Faculty = input.nextLine();
		 
	
		 //Login Student Validations
		 boolean Lg_enterdetails = newLogin.Lg_Login(Lg_Std_Email, Lg_Password, Lg_Std_Faculty);
		 
		 //Check Login Fields empty or not
		 boolean Lg_enterdetails_empty = newLogin.feilds_notnull(Lg_Std_Email, Lg_Password , Lg_Std_Faculty );
		 
		 if(!Lg_enterdetails) {
			// System.out.println("Invalid Login!!!");
		 }else {
			 
			// System.out.println("Successfully Login");
		 }
		 
		 System.out.println("*******************************************\n");
		 System.out.println("\n\n*******************************************");
		 
		 //Get student details for Login
		 System.out.println("Register Student Details,\n");
		 
		 System.out.println("Enter Your Name");
		 System.out.println("First Name:");
		 String F_name = input.nextLine();
		 System.out.println("Middle Name:");
		 String M_name = input.nextLine();
		 
		 System.out.println("Enter Your Birth Date:(DD-MM-YYYY)");
		 String BOD = input.nextLine();
		 
		 System.out.println("Enter Your Phone Number(10 digits):");
		 String P_number = input.nextLine();
		 
		 System.out.println("Enter Your Email address(myname@example.com):");
		 String Email = input.nextLine();
		 
		 // Student Details
		 boolean Std_Reg_details = newStd_Details_Registration.Std_Reg_Details(F_name, M_name, BOD, P_number, Email);
		 
		 //Name validation
		 boolean Std_Deatils_Name = newStd_Details_Registration.compare_FML_Name(F_name, M_name);
		 
		 //Phone Number Validation
		 boolean Std_p_num = newStd_Details_Registration.valid_phone(P_number);
		 
		 //Email validation
		 boolean Std_Reg_Email = newStd_Details_Registration.valid_Email(Email);
		 
		 if(!Std_Reg_details) {
			 System.out.println("Student Details did not submit!!,Check the details again");
		 }else {
			 
			 //System.out.println("Successfully Submit");
		 }
		 
		 System.out.println("*******************************************\n"); 
	}
}
