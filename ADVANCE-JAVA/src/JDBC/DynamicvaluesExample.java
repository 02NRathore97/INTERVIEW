package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicvaluesExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // ClassNotFoundException

		String url = "jdbc:mysql://localhost:3306/advancepractice";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password); // SQLException

		//to read dynamic values
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter name.....");
		String name = br.readLine();
		
		
		String q = "insert into firstjdbc(id,name) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(1, 13);
		pstmt.setString(2, name);
		
		
		int executeUpdate = pstmt.executeUpdate();
		System.out.println("Inserted......"+executeUpdate);
		
		con.close();
	}
}
