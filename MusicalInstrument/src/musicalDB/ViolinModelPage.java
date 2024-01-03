package musicalDB;

import java.sql.SQLException;
import java.util.Scanner;

class Violin {
	void violinModels() {
		InstrumentDAO instrument=new InstrumentDAO();
		try {
			instrument.violinModels();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
public class ViolinModelPage {

	public static void main(String[] args) {
		ColourPage myObj=new ColourPage();
		 System.out.println("\n\n\t\t\t\t"+myObj.Bg_grey+"\t\t"+myObj.purple+"\u001B[1mHome\t"+"\u001B[1m\t\tAbout  "+myObj.red+"\u001B[1m\t\tModels "+myObj.purple+"\t\tContact-us\t Logout\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t\t\t       "+myObj.yellow+"\u001B[1mVIOLINS   "+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t  "+myObj.red+" If Music is life then the \u001B[1mViolin"+myObj.reset+myObj.red+" is its SOUL !..   "+myObj.reset);
		 System.out.println("\n\t\t\t\t"+myObj.yellow+"\u001B[1mAbout Violin"+myObj.reset);
		 System.out.println("\n\t\t\t\t    "+"we brings to you the Violin, also known as a fiddle, with the lowest price guarantee."+"\n\t\t\t\t"
		 		+ " We  have  an  extensive range of violin family like, viola, electric violins,  acoustic "+"\n\t\t\t\t"
		 		+ " violins, violin bass, cello,acoustic-electric violins, double bass and more to buy from."+"\n\t\t\t\t"
		 		+ " We are dedicated to make sure that we have an instrument that suits you whether you are"+"\n\t\t\t\t"
		 		+ " looking for a beginners violin or a professional instrument from best brands world wide"+"\n\t\t\t\t"
		 		+ " such as Fender, Granada, Hofner, Stagg, Vault, and Wolf.");
		 	Violin violin=new Violin();
		 	violin.violinModels(); 
		 	System.out.println("Press 0 for exit :");
		 	Scanner num=new Scanner(System.in);
		 	int n=num.nextInt();
		 	if(n==0) {
		 		IndexPage index = new IndexPage();
				index.main(null);
		 	}
		 }
	}
	






