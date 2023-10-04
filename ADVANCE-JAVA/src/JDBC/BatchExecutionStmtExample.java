package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecutionStmtExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/advancepractice";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		 
		Statement stmt = con.createStatement();
		
		
		stmt.addBatch("insert into firstjdbc(id,name) values(14,'ram')");
		stmt.addBatch("insert into firstjdbc(id,name) values(15,'rama')");
		stmt.addBatch("insert into firstjdbc(id,name) values(16,'ramama')");
		stmt.addBatch("insert into firstjdbc(id,name) values(17,'raman')");
		

		int[] i = stmt.executeBatch();
		for(int j:i) {
			System.out.println("Inserted......" + j);
		}
		
		con.close();
	
	}
}