import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CrudPackage.Database;

public class ResultSetAdditional {
	Connection con;
	ResultSet set;
	Statement statement;
	
	public ResultSetAdditional() throws ClassNotFoundException, SQLException {
		con= new Database().getCon();
		statement=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		//statement=con.createStatement();
		set=statement.executeQuery("SELECT * FROM STUDENT_tbl1");
		set.absolute(2);//It moves to the second row data
		set.relative(5);
		set.updateString("firstname","Sumit");//second row,student
		set.updateRow();//execute the updation
//		set.last();
		set.relative(1);
		set.deleteRow();
		
//		set.updateRow();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		new ResultSetAdditional();
	}

}
