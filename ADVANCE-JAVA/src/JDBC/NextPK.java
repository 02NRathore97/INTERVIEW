package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NextPK {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/advancepractice";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		String q = "insert into firstjdbc(id,name,age) values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(1, nextPK());
		pstmt.setString(2, "Yash");
		pstmt.setInt(3, 22);

		int i = pstmt.executeUpdate();
		System.out.println("Inserted......" + i);
	}

	public static int nextPK() throws ClassNotFoundException, SQLException {
		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");

		String q = "Select max(id) from firstjdbc";
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(q);

		while (set.next()) {
			pk = set.getInt(1);
		}
		return pk + 1;
	}
}
