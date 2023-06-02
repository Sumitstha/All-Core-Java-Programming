package preparePack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import CrudPackage.Database;

//import crudPackage.Database;

public class UpdateStatementDemo {
	Connection con;
	PreparedStatement ps; //optimal
	ResultSet set;
	Statement statement; //generic statement
	
	public UpdateStatementDemo() throws ClassNotFoundException, SQLException {
		Database db = new Database();
		con = db.getCon();
		String update = "UPDATE Student_tbl1 "+" SET firstname = ? "+" WHERE id = ?";
		ps = con.prepareStatement(update);
		ps.setString(1, "Sujan");
		ps.setInt(2, 1);
		ps.execute();
		
		
		String delete="DELETE FROM Student_tbl1 WHERE id=?";
		ps = con.prepareStatement(delete);
		//ps.setString(9,"Surnndra");
		ps.setInt(1, 9);
		ps.execute();
		
		statement = con.createStatement();
		set = statement.executeQuery("SELECT * FROM Student_tbl1");
		while (set.next()) {
			System.out.println("Student ID:" +set.getInt("id"));
			System.out.println("Student Name:" +set.getString("firstname"));
			
		

		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new UpdateStatementDemo();
	}

}