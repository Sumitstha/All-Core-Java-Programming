import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class InsertionData {
//	Statement statement;
//	Connection con;
//	ResultSet set;
//	public InsertionData() throws ClassNotFoundException, SQLException {
//		con = new Database().getCon();
//		statement = con.createStatement();
//		String insert = "INSERT INTO STUDENT_tbl1 VALUES(1, 'Uzumaki Boruto',)";
//		statement.executeUpdate(insert);
//		
//		set = statement.executeQuery("SELECT * FROM STUDENT_tbl1");
//		while (set.next()) {
//			System.out.println("Student ID:" +set.getInt("id"));
//			System.out.println("Student Name:" +set.getString("studentname"));
//		}
//	}
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		new InsertionData();
//
//	}
//
//}