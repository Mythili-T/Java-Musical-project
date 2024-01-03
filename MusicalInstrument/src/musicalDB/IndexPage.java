package musicalDB;

import java.util.*;

public class IndexPage {
	public static void main (String args[]) {
		ColourPage myObj=new ColourPage();
		
		 System.out.println("\n\t\t\t\t"+myObj.Bg_grey+"\t\t"+myObj.red+"\u001B[1mHome\t"+myObj.purple+"\u001B[1m\t\tAbout\t\tModels\t\tContact-us\t Logout\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t\t  "+myObj.yellow+"   \u001B[1mSTART MUSIC STORE   "+myObj.reset);
		 System.out.print(myObj.red + "\n\t\t\t\t\t\t\tWELCOME TO OUR MUSICAL STORE"+myObj.reset);
		 System.out.println(myObj.darkBlue+"\n\n\t\t\t\t\t\t\t   From Starters To Pro.."+myObj.reset);
		 System.out.println("\t\t\t\t\t\t\t\t\t"+"\n\t\t\t\tHere you'll find a huge range of musical equipments of some of the world's famous brands!!.");
		 System.out.println("\n\t\t\t\t\t\t\t\t"+myObj.Bg_grey+"\t"+myObj.red+" SHOP NOW  "+myObj.reset);
		 System.out.print(myObj.orange + "\n\t\t\t\t\t\t\t\u001B[1mGet 25% Off to our products"+myObj.reset);
		 
		 
		 System.out.println(myObj.yellow+"\n\n=> If you want to see the Aboutpage press "+myObj.green+"\u001B[1m2"+myObj.reset);
		 System.out.println(myObj.yellow+"=> If you want to see the Modelspage press "+myObj.green+"\u001B[1m3"+myObj.reset);
		 System.out.println(myObj.yellow+"=> If you want to see the contact-us page press "+myObj.green+"\u001B[1m4"+myObj.reset);
		 System.out.println(myObj.yellow+"=> If you want Logout press "+myObj.green+"\u001B[1m5"+myObj.reset);
		 System.out.println(myObj.black+"\n\u001B[1mPlease enter the number to visit the page : "+myObj.reset);
		 Scanner page=new Scanner(System.in);
		 int number;
		 number=page.nextInt();
		 while(number>=0) {
		 if(number==2) {
			AboutPage about=new AboutPage();
			about.main(null);
		 }
		 else if(number==3) {
			Models model=new Models();
			 model.main(null);
		 }
		 else if(number==5) {
			 homepage home=new homepage();
			 home.main(null);
		 } 
		 else {
			 System.out.println("\n\u001B[1mEnter the correct value");
			 number=page.nextInt();
		 }
		 }
		 
	}
}
