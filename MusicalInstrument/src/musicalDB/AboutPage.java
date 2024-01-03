package musicalDB;

import java.util.Scanner;

public class AboutPage {

	public static void main(String[] args) {
		ColourPage myObj=new ColourPage();
		
		 System.out.println("\n\n\t\t\t\t"+myObj.Bg_grey+"\t\t"+myObj.purple+"\u001B[1mHome\t"+myObj.red+"\u001B[1m\t\tAbout  "+myObj.purple+"\u001B[1m\t\tModels\t\tContact-us\t Logout\t\t"+myObj.reset);
		 System.out.println("\n\n\t\t\t\t\t\t\t\t  "+myObj.red+"     \u001B[1mAbout Us"+myObj.reset);
		  
		 
		 System.out.println("\n\t\t\t\t\t\t"+" \u001B[1m-------------------  Our Mission  --------------------  "+myObj.reset);
		 System.out.println("\n\t\t\t\t"+myObj.black+"\t\tStart Music is Tamilnadu premiere music store, dedicated to providing fine \t"+myObj.reset);
		 System.out.println("\t\t\t\t"+myObj.black+"\t\tinstruments,services with commitment to the highest professional standards.\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+myObj.black+"\t\tWe are  grateful that our  continued success comes from the loyalty of our\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+myObj.black+"\t\tvalued customers and look forward to delivering top quality music services \t"+myObj.reset);
		 System.out.println("\t\t\t\t"+myObj.black+"\t\tfor years to come.\t"+myObj.reset);
		 
		 
		 System.out.println("\n\t\t\t\t\t\t"+" \u001B[1m-------------- What Make us Different? ---------------  "+myObj.reset);
//		 System.out.println("\n\t\t\t\t"+myObj.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t"+myObj.purple+"\t\t\t\t\t"+"\u001B[1mThe Music Workshop"+"\t\t\t\t\t"+myObj.reset);
//         System.out.println("\t\t\t\t"+myObj.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t"+myObj.black+"\t\tThe Workshops Series was  created to help people  of all levels learn about\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+myObj.black+"\t\tthe instruments and gear they can use to make the music they love.\t\t"+myObj.reset);
//		 System.out.println("\t\t\t\t"+myObj.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t"+myObj.reset);
		 
		 
         
         System.out.println("\n\t\t\t\t\t\t"+" \u001B[1m------------------ What People Say? -------------------  "+myObj.reset);
         System.out.println("\n\t\t\t\t"+myObj.black+"\t\tFound this palce yesterday.Ordered some instruments and was very pleased with \t"+myObj.reset);
         System.out.println("\t\t\t\t"+myObj.black+"\t\tthe quick ship time  and  great communication. This was my very first time to \t"+myObj.reset);
         System.out.println("\t\t\t\t"+myObj.black+"\t\tpurchase instruments online instead of in a physical store."+myObj.reset);
         System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+myObj.purple+"\u001B[1m-by Victor vega\t"+myObj.reset);
         
         
         System.out.println("\n\t\t\t\t\t\t"+" \u001B[1m---------------- Service We Offer ---------------------  "+myObj.reset);
//		 System.out.println("\n\t\t\t\t"+myObj.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t"+myObj.reset);
		 System.out.println("\n\t\t\t\t"+"\t\t\t\t"+"=> SHOP ONLINE"+"\t\t\t\t\t\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+"\t\t\t\t"+"=> AV INSTALLATION"+"\t\t\t\t\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+"\t\t\t\t"+"=> GREAT SOUND"+"\t\t\t\t\t\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+"\t\t\t\t"+"=> AUDIO VISUAL DESIGN"+"\t\t\t\t\t\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+"\t\t\t\t"+"=> ON-SITE INSTALLATION"+"\t\t\t\t\t\t"+myObj.reset);
		 System.out.println("\t\t\t\t"+"\t\t\t\t"+"=> FREE SHIPPING"+"\t\t\t\t\t\t"+myObj.reset);
//         System.out.println("\t\t\t\t"+myObj.Bg_black+ "\t\t\t\t\t\t\t\t\t\t\t\t"+myObj.reset);
		 
		 
		 
		 System.out.println(myObj.yellow+"\n\n=> If you want to see the Homepage press "+myObj.green+"\u001B[1m1"+myObj.reset);
		 System.out.println(myObj.yellow+"=> If you want to see the Modelspage press "+myObj.green+"\u001B[1m3"+myObj.reset);
		 System.out.println(myObj.yellow+"=> If you want to see the contact-us page press "+myObj.green+"\u001B[1m4"+myObj.reset);
		 System.out.println(myObj.yellow+"=> If you want Logout press "+myObj.green+"\u001B[1m5"+myObj.reset);
		 System.out.println(myObj.black+"\n\u001B[1mPlease enter the number to visit the page: "+myObj.reset);
		 Scanner page=new Scanner(System.in);
		 int number;
		 number=page.nextInt();
		 int i=0;
		 while(number>1||number<6) {
		 if(number==1) {
			IndexPage index = new IndexPage();
			index.main(null);
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
			 i++;
		 }
		 }
	}
}
