package DBconnection;

import java.sql.*;

public class StudentDAO {

	 public void studentInfo() throws SQLException {
		 Connection con=StudyDB.getConnection();
			Statement st=con.createStatement();
			
			String query="select * from Students";
			
			ResultSet rs=st.executeQuery(query);
	        
	        while(rs.next()) {
	        System.out.println("Student Id is          :"+rs.getInt(1));
	        System.out.println("Student Name is        :"+rs.getString(2));
	        System.out.println("Studying Year          :"+rs.getString(3));
	        
	        
	        System.out.println("------------------------------------");
	        }
	        
	        
	        con.close();
	 }
}
