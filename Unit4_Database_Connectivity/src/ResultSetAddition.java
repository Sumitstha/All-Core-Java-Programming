import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//import crudPackage.Database;

public class ResultSetAddition {
	Connection con;
	ResultSet set;
	Statement statement;
	
	public ResultSetAddition() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		set = statement.executeQuery("SELECT * FROM Student_tbl1");
		set.absolute(3); //moves to the second position
		set.updateString("firstname", "Ram");
		set.updateRow();// execute the updation
		//set.last(); // puts the pointer at last data
		//set.deleteRow();
		while (set.next()) {
			System.out.println("Student ID:" +set.getInt("id"));
			System.out.println("Student Name:" +set.getString("firstname"));
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new ResultSetAddition();

	}
}
