package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandlingExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice","root","root");
		Statement stmt = con.createStatement();
		try {
			con.setAutoCommit(false);
			
			stmt.executeUpdate("insert into firstjdbc(id,name) values(21,'Neeraj')");
			stmt.executeUpdate("insert into firstjdbc(id,name) values(22,'Neeraj')");
			stmt.executeUpdate("insert into firstjdbc(id,name) values(23,'Neeraj')");
			
			con.commit();
		} catch (Exception e) {
			con.rollback();
		}
		
	}
}
