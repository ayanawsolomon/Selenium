package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCandMySQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Select and insert to customers table in my ecommerce database
		// register the driver
		Class.forName("com.mysql.jdbc.Driver");
		// connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "");
		// create a statement object to run query 
		Statement stmt = con.createStatement();
		// Register a customer to my ecommerce customer table
		String query ="INSERT INTO customers "
				+ "(`CustomerID`, `CustomerName`, `ContactName`, `Address`, `City`, `PostalCode`, `Country`) "
				+ "VALUES ('121212', 'RRRRRR', 'TTTTTTT', 'Locust Drive', 'Herndo', '20170', 'USA')";
		// stmt.execute(query);
		System.out.println("sucessfull!!");
		
		// query to select all my customers 
		query = "Select * from customers";
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(5) + "-----" + rs.getString(7));
		}
		
		con.close();
	}

}
