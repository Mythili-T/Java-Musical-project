package DBconnection;
import java.sql.*;
public class StudyDB {
	
	public static final String url="jdbc:mysql://localhost:3306/StudyMaterial";
	public static final String userName="root";
	public static final String password="Mythili@1210";
    
    public static Connection getConnection() throws SQLException  {
    	return DriverManager.getConnection(url,userName,password);
}
}
