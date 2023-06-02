package CrudPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	Statement statement;
	Connection con;
	ResultSet set;
	
public InsertTable() throws ClassNotFoundException, SQLException {
	con = new Database().getCon();//reach at database
	statement=con.createStatement();
	String insert="INSERT INTO STUDENT_tbl1 VALUES(1,'Sujan','Shrestha',9865858435)";
	statement.executeUpdate(insert);
	set=statement.executeQuery("SELECT * FROM Student_tbl1");
	while(set.next()) {
		System.out.println("Student id:"+set.getInt("id"));
		System.out.println("First name:"+set.getString("firstname"));
		System.out.println("Last name:"+set.getString("lastname"));
		System.out.println("Contact number:"+set.getString("contactno"));
	}
	
}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		new InsertTable();
	}

}
