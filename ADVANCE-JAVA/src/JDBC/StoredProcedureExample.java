package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedureExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice","root","root");
		
		//CallableStatement call = con.prepareCall("{call TEST(?,?)}");
		CallableStatement call = con.prepareCall("{call TEST(?)}");
		call.setInt(1, 2);
		call.registerOutParameter(1, Types.INTEGER);

		call.execute();
		System.out.println(call.getString(1));
		
		
		con.close();
		
		call.close();
		
		
	}

}
