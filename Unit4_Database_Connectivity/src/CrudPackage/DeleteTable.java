package CrudPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {
	Statement statement;
	Connection con;
	ResultSet set;
	
public DeleteTable() throws ClassNotFoundException, SQLException {
	con = new Database().getCon();//reach at database
	statement=con.createStatement();
	String delete="DELETE FROM Student_tbl1 where id=1;";
	statement.executeUpdate(delete);
	set=statement.executeQuery("SELECT * FROM Student_tbl1");
	while(set.next()) {
		System.out.println("Student id:"+set.getInt("id"));
		System.out.println("Student name:"+set.getString("studentname"));
		
	}
}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		new DeleteTable();
	}

}
