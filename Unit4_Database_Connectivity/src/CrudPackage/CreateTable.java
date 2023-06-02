package CrudPackage;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	Statement statement;
	Connection con;
public CreateTable() throws ClassNotFoundException, SQLException {
	con = new Database().getCon();
	statement=con.createStatement();
	String create="CREATE TABLE STUDENT_tbl1("
			+"id int,studentname varchar(100)"
			+");";
	statement.executeUpdate(create);
	System.out.println("Table Created");
	
	
}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		new CreateTable();
	}

}
