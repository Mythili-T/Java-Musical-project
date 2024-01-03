package musicalDB;

import java.sql.*;


public class InstrumentDB {
	public static final String url="jdbc:mysql://localhost:3306/InstrumentDetails";
	public static final String userName="root";
	public static final String password="Mythili@1210";
    
    public static Connection getConnection() throws SQLException  {
    	return DriverManager.getConnection(url,userName,password);
}
}
