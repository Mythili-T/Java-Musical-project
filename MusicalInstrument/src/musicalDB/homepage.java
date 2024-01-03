package musicalDB;

import java.util.*;

public class homepage {

	public static void main(String[] args)  {
//		MusicalDAO myObj=new MusicalDAO();
//		myObj.studentInfo();
		ColourPage colour=new ColourPage();
		int Login=1;
		int TempNumber=1;
		while(TempNumber>0) {
			System.out.println(colour.red+"Enter 1 for Login 2 for Sign up")	;
			Scanner myObj= new Scanner(System.in);
			Login =myObj.nextInt();
			if(Login==1) {
				LoginPage myLogin=new LoginPage();
				myLogin.main(args);
				TempNumber=0;
			}
			else if(Login==2) {
				RegisterPage myObject=new RegisterPage();
				myObject.main(args);
				TempNumber=0;
			}
			else {
				System.out.println("Please enter a valid choice");
				TempNumber=1;
			}
		}
		}
}
