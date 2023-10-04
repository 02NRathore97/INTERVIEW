package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;



public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");	//ClassNotFoundException
		
		String url = "jdbc:mysql://localhost:3306/advancepractice";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);	//SQLException
		
		String q = "insert into firstjdbc(id, name) values(5,'Yash')";
		Statement stmt = con.createStatement();
		
		
		
		int i = stmt.executeUpdate(q);
		//boolean i = stmt.execute(q);
		//ResultSet set = stmt.executeQuery(q);
		System.out.println("Inserted......."+i);
	
	con.close();
	}
}
