package musicalDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MusicalDAO {
	ColourPage Colour=new ColourPage();
	public void userInfo(String query) throws SQLException {
		 Connection con=MusicalDB.getConnection();
			Statement st=con.createStatement();	
			int rows=st.executeUpdate(query);
			System.out.println("Number of rows instered :"+rows);
			con.close();
	 }

	
	public void userInfo1(String usernameval, String passwordval) throws SQLException{
		
		 Connection con=MusicalDB.getConnection();
		

		String query = "SELECT user_email,user_password  FROM registerUser WHERE user_email = '" + usernameval + "'";

		try {
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    
		    if (rs.next()) {
		        String storedPassword = rs.getString("user_password");
		        
		        if (storedPassword.equals(passwordval)) {
		            System.out.println(Colour.green+"Login Successfull"+Colour.reset);
		            System.out.println(Colour.darkBlue+"Welcome to the website"+Colour.reset);
		            IndexPage indexpage=new IndexPage();
		            indexpage.main(null);
		            
		        } else {
		            System.out.println(Colour.red+"Password Mismatched"+Colour.reset);
		        }
		    } else {
		        System.out.println(Colour.red+"Username not found."+Colour.reset);
		    }
		} 
		
		catch (SQLException e) {
		   
		    e.printStackTrace();
		} 
		
		finally {
		    try {
		        con.close();
		    }
		    catch (SQLException e){
				e.printStackTrace();

			}
		}
	}
	}