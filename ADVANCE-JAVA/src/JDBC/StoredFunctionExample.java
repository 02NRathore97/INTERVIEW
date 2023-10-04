package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredFunctionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice","root","root");
		
		CallableStatement call = con.prepareCall("{? = call TestFunction()}");
		call.registerOutParameter(1, Types.INTEGER);
		call.execute();
		
		System.out.println(call.getInt(1));
		
		call.close();
		con.close();
		
		
	}

}
