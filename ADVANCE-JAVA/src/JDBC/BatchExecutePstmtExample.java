package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchExecutePstmtExample {
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
		pstmt.addBatch();
		
		pstmt.setInt(1, 9);
		pstmt.setString(2, "Ram");
		pstmt.addBatch();

		int[] i = pstmt.executeBatch();
		for(int j:i) {
			System.out.println("Inserted......" + j);
		}
		
		con.close();

		// boolean execute = pstmt.execute();
	}
}