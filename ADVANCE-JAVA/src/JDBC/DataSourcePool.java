package JDBC;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;


//make class final
public final class DataSourcePool {

	//define self type variable static 
	private static DataSourcePool dsp = null;
	
	private ComboPooledDataSource ds = null; 
	
	//create default constructor private
	private DataSourcePool() throws Exception {
		ds = new ComboPooledDataSource();
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/advanepractice");
		ds.setUser("root");
		ds.setPassword("root");
		ds.setInitialPoolSize(0);
		ds.setMaxPoolSize(20);
		ds.setAcquireIncrement(5);
	}
	
	//create getInstance method static
	public static DataSourcePool getInstance() throws Exception {
		if(dsp == null) {
			dsp = new DataSourcePool();
		}
		return dsp;
	}
	
	
	public static Connection getConnection() throws SQLException, Exception {
		return getInstance().ds.getConnection();
	}
	
	public static void closeConnection(Connection con, Statement stmt, ResultSet set) throws SQLException {
		if(con!=null) {con.close();}
		if(stmt!=null) {stmt.close();}
		if(set!=null) {set.close();}
	}
	
	public static void closeConnection(Connection con, Statement stmt) throws SQLException {
		closeConnection(con, stmt, null);
	}
	public static void closeConnection(Connection con) throws SQLException {
		closeConnection(con, null, null);
	}
}
