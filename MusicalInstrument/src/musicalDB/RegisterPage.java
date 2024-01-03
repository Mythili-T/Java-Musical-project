package musicalDB;
import java.sql.SQLException;
import java.util.*;

import java.util.regex.*;
		
		
		
	class RegisterData{
		String userNameValue, emailValue, passwordValue, confirmPasswordValue;
		
		ColourPage Colour=new ColourPage();
		void userNameValidation() {
			Scanner	myObj = new Scanner(System.in);
			System.out.print(Colour.darkBlue + "\nEnter Username - " + Colour.reset);
			String userName = myObj.nextLine();
			Pattern userNameRegex = Pattern.compile("^(?!.*(.).*\\1\\1)[a-zA-Z]{3,20}$");
			Matcher userNameMatches = userNameRegex.matcher(userName);
			if (userName.isEmpty()) {
			System.out.println(Colour.red + "Username is not Empty" + Colour.reset);
			userNameValidation();
			} else if (!userNameMatches.matches()) {
			System.out.println(Colour.red
			+ "Enter Valid Username : \n\t* Username only contains Alphabets, \n\t* Minimum of 3 digits, \n\t* 2 similar consecutive characters only allowed, \n\t* No Spaces allowed"
			+ Colour.reset);
			userNameValidation();
			} else {
			System.out.println(Colour.green + "Correct" + Colour.reset);
			userNameValue = userName;
			emailValidation();
			}
			}
		
		
		void emailValidation() {
			Scanner myObj = new Scanner(System.in);
			System.out.print(Colour.darkBlue + "\nEnter Your Email  - " + Colour.reset);
			String email = myObj.nextLine();
			Pattern emailRegex = Pattern
			.compile("^[0-9a-z]+[._]{0,1}[0-9a-z]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}([.][a-zAZ]{2,3}){0,1}$");
			Matcher emailMatches = emailRegex.matcher(email);
			if (email.isEmpty()) {
			System.out.println(Colour.red + "Email is not Empty" + Colour.reset);
			emailValidation();
			} else if (!emailMatches.matches()) {
			System.out
			.println(Colour.red + "Enter Valid Email : email only in mythili@gmail.com this format" + Colour.reset);
			emailValidation();
			} else {
			System.out.println(Colour.green + "Correct" + Colour.reset);
			emailValue = email;
			passworValidation();
			}
			}
		
		
		void passworValidation() {
			Scanner myObj = new Scanner(System.in);
			System.out.print(Colour.darkBlue + "\nEnter Your Password  - " + Colour.reset);
			String password = myObj.nextLine();
			Pattern passwordRegex = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).{6,12}$");
			Matcher passwordMatches = passwordRegex.matcher(password);
			if (password.isEmpty()) {
			System.out.println(Colour.red + "password is not Empty" + Colour.reset);
			passworValidation();
			} else if (!passwordMatches.matches()) {
			System.out.println(Colour.red +
			"Enter Valid password : \nPassword must Contains :- \n\t* Minimum of 6 Digits, \n\t* Minimum 1 Alphabets, \n\t* Minimum 1 Numbers, \n\t* Minimum 1 Special Characters"
			+ Colour.reset);
			passworValidation();
			}
			else {
			System.out.println(Colour.green + "Correct" + Colour.reset);
			passwordValue = password;
			confirmPasswordValidation();
			}
			}
		
		void confirmPasswordValidation() {
			Scanner myObj = new Scanner(System.in);
			System.out.print(Colour.darkBlue + "\nEnter Confirm Password  - " + 
			Colour.reset);
			String confirmPassword = myObj.nextLine();
			if (confirmPassword.isEmpty()) {
			System.out.println(Colour.red + "Confirm password is not Empty" + Colour.reset);
			confirmPasswordValidation();
			} 
			else if (!confirmPassword.equals(passwordValue)) {
			System.out.println(Colour.red + "Confirm password must same as Password" + 
			Colour.reset);
			confirmPasswordValidation();
			}
			else {
			System.out.println(Colour.green + "Correct" + Colour.reset);
			confirmPasswordValue = confirmPassword;
		insertData();
			}
			}
		
		void insertData() {
			if (userNameValue.equalsIgnoreCase("admin")) {
			System.out.println(Colour.red + "\n Admin name is not allowed, Please Try Other Username!!" + Colour.reset);
			userNameValidation();
			} else {
			String sql = "insert into registerUser values(" + "'" + userNameValue + "','" + 
			emailValue + "','"
			+ passwordValue + "','" + confirmPasswordValue + "')";
			MusicalDAO myObj = new MusicalDAO();
			try {
				myObj.userInfo(sql);
			}
			catch (SQLException e){
				e.printStackTrace();

			}
			}
			}
	}
		

	
public class RegisterPage {

	public static void main(String[] args) {
		ColourPage Colour=new ColourPage();
		System.out.println(Colour.purple + "\n<-----------------REGISTER PAGE----------------->" + 
				Colour.reset);
		RegisterData user = new RegisterData();
				user.userNameValidation();
				System.out.println(Colour.green+"Registered has successfull"+Colour.reset);
				System.out.println(Colour.darkBlue+"Redirect to login page"+Colour.reset);

	}

}
