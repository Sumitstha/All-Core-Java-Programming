

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactiontry {
	Statement statement;
	Connection con;
	ResultSet set;
	
	public Transactiontry() throws ClassNotFoundException, SQLException {
		con = new Database().getCon();
		statement = con.createStatement();
		con.setAutoCommit(false); 
		String s1="UPDATE transaction_tb1 SET "+ "accbalance=accbalance-1000 "+" WHERE acno=2"; 
		String s2="UPDATE transaction_tb1 SET "+ "accbalance=accbalance+1000 "+" WHERE acno=1"; 
		statement.executeUpdate(s1); 
		statement.executeUpdate(s2);
		con.commit();
		
		set = statement.executeQuery("SELECT * FROM transaction_tb1");
		while (set.next()) {
			System.out.println("Account Number:" +set.getInt("acno"));
			System.out.println("Account Name:" +set.getString("accname"));
			System.out.println("Account Name:" +set.getBigDecimal("accbalance"));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Transactiontry();

	}

}