

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionCreate {
	Statement statement;
	Connection con;
	
	public TransactionCreate() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		statement = con.createStatement();
		String create = "CREATE TABLE transaction_tb2("
				+"acno int, accname varchar(100), accbalance decimal"
				+ ");";
		statement.executeUpdate(create);
		System.out.println("Table Created");
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new TransactionCreate();

	}

}
