package preparePack;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class PreparedStatementsDemo {

Connection con;
Statement statement1;
PreparedStatement statement;
public PreparedStatementsDemo() throws SQLException {
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
System.out.println("Driver loaded");
String server = "//DESKTOP-L7LVCJU\\SQLEXPRESS";
String database = "CollegeDb";
int port = 1433;
String jdbcUrl = "jdbc:sqlserver:" + server + ":" + port + ";databaseName=" + database
+ ";integratedSecurity=true";
con = DriverManager.getConnection(jdbcUrl);
System.out.println("Connection obtained");
String insertString = "Insert Into tblStudent " + " values " + " (?,?,?,?,?)";
statement = con.prepareStatement(insertString);
statement.setString(1, "Ramesh Chapagain");
statement.setString(2, "Vedas College");
statement.setString(3, "Naya Naikap");
statement.setString(4, "980000000000");
statement.setString(5, "Ram Kumar Chapagain");
statement.executeUpdate();
statement.setString(1, "Naresh Bista");
statement.setString(2, "Everest College");
statement.setString(3, "Chabahil");
statement.setString(4, "9800880000");
statement.setString(5, "Shyam Bista");
statement.executeUpdate();
statement1 = con.createStatement();
String selectData = "SELECT * from tblstudent;";
ResultSet rsltset = statement1.executeQuery(selectData);
while (rsltset.next()) {
System.out.println("The name of the Student is " + 
rsltset.getNString("StudentName")
+ " whose College Name is " + 
rsltset.getNString("CollegeName"));
}
} catch (SQLException e) {
e.printStackTrace();
} catch (ClassNotFoundException e) {

e.printStackTrace();
} finally {
statement.close();
statement1.close();
con.close();
}
}
public static void main(String[] args) throws SQLException {
new PreparedStatementsDemo();
}
}

