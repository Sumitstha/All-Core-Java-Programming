package preparePack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CrudPackage.Database;

public class PreparedStatementDemo {
	Statement statement;//generic statement
	Connection con;
	ResultSet set;
	PreparedStatement ps;//optimal statement
	
	public PreparedStatementDemo() throws ClassNotFoundException, SQLException {
		Database db= new Database();
		con=db.getCon();
		String insert="INSERT INTO Student_tbl1 VALUES(?,?);";
		ps=con.prepareStatement(insert);
		ps.setInt(1, 8);
		ps.setString(2, "Mahendra");
		ps.execute();
		
		ps.setInt(1, 9);
		ps.setString(2,"Surendra");
		ps.execute();
		
		int empid=34;
		String name="Rajesh";
		ps.setInt(1, empid);
		ps.setString(2, name);
		ps.execute();
		statement=con.createStatement();
		set=statement.executeQuery("SELECT * FROM Student_tbl1");
		while(set.next()) {
			System.out.println("Student id:"+set.getInt("id"));
			System.out.println("Student name:"+set.getString("studentname"));
			System.out.println("Last name:"+set.getString("lastname"));
			System.out.println("Contact number:"+set.getString("contactno"));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		new PreparedStatementDemo();
	}

}
