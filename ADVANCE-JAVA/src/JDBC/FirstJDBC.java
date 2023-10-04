package JDBC;
import java.sql.*;
public class FirstJDBC {
	public static void main(String[] args) {
		try {
			
			//1.load the Driver
			//Approach-1
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//Approach-2
			//Driver myDriver = new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(myDriver);
						//OR
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			
			
			
			//2.Create Connection
			String url = "jdbc:mysql://localhost:3306/advancepractice";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,username,password);
			
			if (con.isClosed()) {
				System.out.println("Connection is closed.....");
			} else {
				System.out.println("Connection Created......");
			}
			
			
			
			//3.create query and execute
			String q = "Select * from firstjdbc";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
		
			
			//4.process data
			while(set.next()) {
				int i = set.getInt("id");
				String name = set.getString("name");
				
				System.out.println(i);
				System.out.println(name);
			}
			
			
			//5.close connection
			con.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
