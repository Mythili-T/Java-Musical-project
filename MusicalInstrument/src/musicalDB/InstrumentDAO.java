package musicalDB;

import java.sql.*;

public class InstrumentDAO {

	
//			                 	violin details
	
		public void violinModels() throws SQLException {
			ColourPage myObj=new ColourPage();
			String query = "Select * from ViolinDetails";
			Connection con = InstrumentDB.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
		
		int num=1;
		System.out.println("\n\t\t\t\t"+myObj.yellow+"\u001B[1mOur Products"+myObj.reset);
		if(num>0) {
		while(rs.next()) {
			    System.out.println("\n\t\t\t\t\t\t"+myObj.red+"--> "+rs.getString(1)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Color --- "+myObj.darkBlue+rs.getString(2)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Original Price --- "+myObj.red+rs.getString(3)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Discount  --- "+myObj.purple+rs.getString(4)+"%"+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Discount Price --- "+myObj.darkBlue+rs.getString(5)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Ratings --- "+myObj.green+rs.getString(6)+myObj.reset);	    
		   }
		}
	}
		
		
//											Trumpet details	
		
		
		public void trumpetModels() throws SQLException {
			ColourPage myObj=new ColourPage();
			String query = "Select * from TrumpetDetails";
			Connection con = InstrumentDB.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
		
		int num=1;
		System.out.println("\n\t\t\t\t"+myObj.yellow+"\u001B[1mOur Products"+myObj.reset);
		if(num>0) {
		while(rs.next()) {
			    System.out.println("\n\t\t\t\t\t\t"+myObj.red+"--> "+rs.getString(1)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Color --- "+myObj.darkBlue+rs.getString(2)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Original Price --- "+myObj.red+rs.getString(3)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Discount  --- "+myObj.purple+rs.getString(4)+"%"+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Discount Price --- "+myObj.darkBlue+rs.getString(5)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Ratings --- "+myObj.green+rs.getString(6)+myObj.reset);	    
		   }
		}
	}
	
	//					Piano details	
		
		public void 	pianoModels() throws SQLException {
			ColourPage myObj=new ColourPage();
			String query = "Select * from PianoDetails";
			Connection con = InstrumentDB.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
		
		int num=1;
		System.out.println("\n\t\t\t\t"+myObj.yellow+"\u001B[1mOur Products"+myObj.reset);
		if(num>0) {
		while(rs.next()) {
			    System.out.println("\n\t\t\t\t\t\t"+myObj.red+"--> "+rs.getString(1)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Color --- "+myObj.darkBlue+rs.getString(2)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Original Price --- "+myObj.red+rs.getString(3)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Discount  --- "+myObj.purple+rs.getString(4)+"%"+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Discount Price --- "+myObj.darkBlue+rs.getString(5)+myObj.reset);
			    System.out.println("\n\t\t\t\t\t\t\t\t"+"Ratings --- "+myObj.green+rs.getString(6)+myObj.reset);	    
		   }
		}
	}
				
}
