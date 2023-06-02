package StudentPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
	Connection con;
public Database()  throws ClassNotFoundException, SQLException{
	
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	String server="//DESKTOP-OCCEES9\\SQLEXPRESS";
	int port=1433;
	String database="Ambition_db";
	String connectionStr="jdbc:sqlserver:"+server+":"+port+";databaseName="+database+";integratedSecurity=true;encrypt=true;trustServerCertificate=true";	
	con = DriverManager.getConnection(connectionStr);
	System.out.println("Connection Established");
	
}
//	public static void main(String[] args) throws ClassNotFoundException, SQLException{
//		// TODO Auto-generated method stub
//		new Database();
//	}

public Connection getCon() {
	return con;
}

}
