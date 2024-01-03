package musicalDB;

import java.util.*;


public class Models {
	public static void main(String []args) {
		ColourPage myObj=new ColourPage();
		 System.out.println("\n\n\t\t\t\t"+myObj.Bg_grey+"\t\t"+myObj.purple+"\u001B[1mHome\t"+"\u001B[1m\t\tAbout  "+myObj.red+"\u001B[1m\t\tModels "+myObj.purple+"\t\tContact-us\t Logout\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t\t\t     "+myObj.yellow+"\u001B[1mSTART MUSIC   "+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t\t    "+myObj.purple+" “ Where Words Fail, Music Speaks !... ”   "+myObj.reset);
		 System.out.println("\n\t\t\t\t"+"The Start Music brand is well known for stocking  a  catalog of over 50 products spanning"+"\n\t\t\t\t"+"20+ brands, offering competitive prices, and"
		 + "  providing  the best customer service in the "+"\n\t\t\t\t"+"industry par none. This has enabled it to become one of the most  trusted names in  music"+"\n\t\t\t\t"+"gear retailing.");
		 System.out.println("\n\t\t\t\t\t\t"+myObj.yellow+" \u001B[1m------------------ OUR INSTRUMENTS -------------------  "+myObj.reset);
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mViolin"+"     \u001B[1m------------"+"\t"+"\u001B[1m5 Variety");
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mTrumpet"+"    \u001B[1m------------"+"\t"+"\u001B[1m4 Variety");
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mPiano"+"      \u001B[1m------------"+"\t"+"\u001B[1m8 Variety");
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mGuitar"+"     \u001B[1m------------"+"\t"+"\u001B[1m10 Variety");
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mDrum"+"       \u001B[1m------------"+"\t"+"\u001B[1m6 Variety");
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mFlute"+"      \u001B[1m------------"+"\t"+"\u001B[1m5 Variety");
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mAudio"+"      \u001B[1m------------"+"\t"+"\u001B[1m9 Variety");
		 System.out.println("\n\t\t\t\t\t\t\t"+"    \u001B[1mSaxophone"+"  \u001B[1m------------"+"\t"+"\u001B[1m4 Variety");
		 System.out.println("\n\t\t\t\t\t\t"+myObj.yellow+" \u001B[1m------------------------------------------------------  "+myObj.reset);
		 System.out.println("\n"+myObj.red+"To know  more about the each product  "+myObj.reset+  "\u001B[1mType the Product name Or Type Exit :");
		 Scanner scanner=new Scanner(System.in);
		 String Model=scanner.next();
		 int i=0;
		 int n=0;
		 while(n>=0) {
		 if(Model.equals("Violin")||Model.equals("violin")) {
			 ViolinModelPage violinPage = new ViolinModelPage();
			 violinPage.main(null);
			 System.exit(0);
		 }
		 else if(Model.equals("Trumpet")||Model.equals("trumpet")) {
			 TrumpetModelPage trumpetPage=new TrumpetModelPage();
			 trumpetPage.main(null);
			 System.exit(0);
			 
		 }
		 else if(Model.equals("Piano")||Model.equals("piano")) {
			 PianoModelPage pianoPage=new PianoModelPage();
			 pianoPage.main(null);
			 System.exit(0);
			 
		 }
		 else if(Model.equals("Guitar")||Model.equals("guitar")) {
			 GuitarModelPage guitarPage=new GuitarModelPage();
			 guitarPage.main(null); 	 	
			 System.exit(0);
			 
		 }
		 else if(Model.equals("Drum")||Model.equals("drum")) {
			 DrumModelPage drumPage=new DrumModelPage();
			 drumPage.main(null); 	 	
			 System.exit(0);
			 
		 }
		 else if(Model.equals("Flutes")||Model.equals("flutes")) {
			 FlutesModelPage flutesPage=new FlutesModelPage();
			 flutesPage.main(null); 	 	
			 System.exit(0);
			 
		 }
		 else if(Model.equals("AudioInterface")||Model.equals("audiointerface")) {
			 SpeakerModelPage speakerPage=new SpeakerModelPage();
			 speakerPage.main(null); 	 	
			 System.exit(0);
			 
		 }
		 else if(Model.equals("Saxophone")||Model.equals("saxophone")) {
			 SaxophoneModelPage saxophonePage=new SaxophoneModelPage();
			 saxophonePage.main(null); 	 	
			 System.exit(0);
			 
		 }
		 else if(Model.equals("Exit")||Model.equals("exit")) {
			 IndexPage index=new IndexPage();
			 index.main(null);
		 }
		 
		 else {
			 System.out.println("\n\u001B[1mEnter the correct value");
			 Model=scanner.next();
		 }
		 }
		
		
		 }
	}


