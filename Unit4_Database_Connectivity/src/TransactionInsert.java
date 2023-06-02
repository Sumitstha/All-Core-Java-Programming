

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionInsert {
	Statement statement;
	Connection con;
	ResultSet set;
	
	public TransactionInsert() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		statement = con.createStatement();
		String insert = "INSERT INTO transaction_tb1 VALUES(1, 'Sujan Shrestha', 2000000)";
		statement.executeUpdate(insert);
		
		set = statement.executeQuery("SELECT * FROM transaction_tb1");
		while (set.next()) {
			System.out.println("Account Number:" +set.getInt("acno"));
			System.out.println("Account Name:" +set.getString("accname"));
			System.out.println("Account Name:" +set.getBigDecimal("accbalance"));
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new TransactionInsert();

	}

}
