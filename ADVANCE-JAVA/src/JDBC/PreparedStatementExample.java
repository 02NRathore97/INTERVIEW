package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreparedStatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		

		String url = "jdbc:mysql://localhost:3306/advancepractice";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		
		String q = "insert into firstjdbc(id,name) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(1, 8);
		pstmt.setString(2, "Vinay");
		
		
		int executeUpdate = pstmt.executeUpdate();
		System.out.println("Inserted......"+executeUpdate);
		
		
		//boolean execute = pstmt.execute();
		
		//.......................................................................
		
//		String q = "select * from firstjdbc";
//		PreparedStatement pstmt = con.prepareStatement(q);
//		ResultSet set = pstmt.executeQuery();
//		while(set.next()) {
//			int i = set.getInt("id");
//			String name = set.getString("name");
//			System.out.println(i);
//			System.out.println(name);
//		}
		
		con.close();
		
	}
}
