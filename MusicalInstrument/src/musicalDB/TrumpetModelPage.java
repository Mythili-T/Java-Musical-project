package musicalDB;

import java.sql.SQLException;

class Trumpet {
	void trumpetModels() {
		InstrumentDAO instrument=new InstrumentDAO();
		try {
			instrument.trumpetModels();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class TrumpetModelPage {

	public static void main(String[] args) {
		ColourPage myObj=new ColourPage();
		 System.out.println("\n\n\t\t\t\t"+myObj.Bg_grey+"\t\t"+myObj.purple+"\u001B[1mHome\t"+"\u001B[1m\t\tAbout  "+myObj.red+"\u001B[1m\t\tModels "+myObj.purple+"\t\tContact-us\t Logout\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t\t\t       "+myObj.yellow+"\u001B[1mTRUMPETS   "+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t"+myObj.red+" At the round earth's imagined corners, blow your \u001B[1mTrumpets !..."+myObj.reset);
		 System.out.println("\n\t\t\t\t"+myObj.yellow+"\u001B[1mAbout Trumpet"+myObj.reset);
		 System.out.println("\n\t\t\t\t"+"    Trumpets are used in art music styles, for instance in orchestras, concert bands,and"
		 +"\n\t\t\t\t"+"jazz ensembles, as well as in popular music.They are played by blowing airthrough nearly,"
		 +"\n\t\t\t\t"+"closed lips producing a \"buzzing\" sound that starts a standing wave vibration in the air"
		 + "\n\t\t\t\t"+"column inside the instrument.Stainless Steel Pistons have remarkably smooth, fast action"
		 + "\n\t\t\t\t"+"for improved agility and play ability and we have the Adjustable 1st and 3rd Valve Slide"
		 +"\n\t\t\t\t"+"allows the player to custom fit the instrument to achieve maximum performance comfort.");
		 Trumpet trumpet=new Trumpet();
		 trumpet.trumpetModels(); 
}
}



