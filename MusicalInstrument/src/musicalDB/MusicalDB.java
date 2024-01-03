package musicalDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MusicalDB {

	public static final String url="jdbc:mysql://localhost:3306/Musicalinstuments";
	public static final String userName="root";
	public static final String password="Mythili@1210";
    
    public static Connection getConnection() throws SQLException  {
    	return DriverManager.getConnection(url,userName,password);
}
}
