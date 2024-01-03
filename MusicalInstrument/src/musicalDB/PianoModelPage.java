package musicalDB;

import java.sql.SQLException;

class Piano {
	void pianoModels() {
		InstrumentDAO instrument=new InstrumentDAO();
		try {
			instrument.pianoModels();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class PianoModelPage {

	public static void main(String[] args) {
		ColourPage myObj=new ColourPage();
		 System.out.println("\n\n\t\t\t\t"+myObj.Bg_grey+"\t\t"+myObj.purple+"\u001B[1mHome\t"+"\u001B[1m\t\tAbout  "+myObj.red+"\u001B[1m\t\tModels "+myObj.purple+"\t\tContact-us\t Logout\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t\t\t       "+myObj.yellow+"\u001B[1mPIANOS   "+myObj.reset);
		 System.out.println("\n\t\t\t\t\t"+myObj.red+"Life is like "+"\u001B[1mPiano.."+myObj.reset+myObj.red+"what you get out of it depends on how you play it!..."+myObj.reset);
		 System.out.println("\n\t\t\t\t"+myObj.yellow+"\u001B[1mAbout Piano"+myObj.reset);
		 System.out.println("\n\t\t\t\t"+"     Portable Keyboards are the most popular type of keyboards. They are well known for "+"\n\t\t\t\t"+
				 						 "their features, affordability & portability.They come in various lengths and sizes, and  "+"\n\t\t\t\t"+
				 						 "include a variety of digital sounds and accompaniment features.They usually have built-"+"\n\t\t\t\t"+
				 						 "in speakers, and battery operation is common with smaller models. ");
		 
		 Piano piano=new Piano();
		 	piano.pianoModels(); 
	}

}
