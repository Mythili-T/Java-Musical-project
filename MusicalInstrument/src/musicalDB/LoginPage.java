package musicalDB;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class loginDetails{
	
	
void userNameValidation() {
 	ColourPage colour=new ColourPage();
		Scanner sc=new Scanner(System.in);
		System.out.print( colour.black+"\u001B[1mEnter Username-"+ colour.reset);
		
		String usernameval=sc.nextLine();
		
		System.out.print( colour.black+"\u001B[1mEnter Password-"+ colour.reset);
		String passwordval=sc.nextLine();
		
		MusicalDAO myObj = new MusicalDAO();
		try {
			myObj.userInfo1(usernameval,passwordval);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
	}
}

public class LoginPage {

	public void main(String[] args) {
		loginDetails logindetails=new loginDetails();
		logindetails.userNameValidation();
		
	}

}
