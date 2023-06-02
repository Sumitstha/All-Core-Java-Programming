package preparePack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CrudPackage.Database;

public class UpdateDemo {
	Statement statement;//generic statement
	Connection con;
	ResultSet set;
	PreparedStatement ps;//optimal statement
	
	public UpdateDemo() throws ClassNotFoundException, SQLException {
		Database db= new Database();
		con=db.getCon();
		String update="UPDATE Student_tbl1"+ "SET studentname=?"+" where id=?;";
		ps=con.prepareStatement(update);
		
		ps.setString(2, "Mahe");
		
		
		
		ps.setString(2,"Sure");
		
		
//		int empid=34;
//		String name="Rajesh";
//		ps.setInt(1, empid);
//		ps.setString(2, name);
//		ps.execute();
		statement=con.createStatement();
		
		set=statement.executeQuery("SELECT * FROM Student_tbl1");
		while(set.next()) {
			System.out.println("Student id:"+set.getInt("id"));
			System.out.println("Student name:"+set.getString("studentname"));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		new UpdateDemo();
	}

}
