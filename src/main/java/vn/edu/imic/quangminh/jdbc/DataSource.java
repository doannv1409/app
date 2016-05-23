package vn.edu.imic.quangminh.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class DataSource {
	private String serverName;
	private String databaseName;
	private int port = 1433;
	private String username;
	private String password;
	private Connection conn;
	
	public DataSource(String serverName, String databaseName, String username, String password) {
		this.serverName = serverName;
		this.databaseName = databaseName;
		this.username = username;
		this.password = password;
	}

	public Connection getConnection() {
		SQLServerDataSource dataSource = new SQLServerDataSource();
		dataSource.setServerName(serverName);
		dataSource.setDatabaseName(databaseName);
		dataSource.setPortNumber(port);
		dataSource.setUser(username);
		dataSource.setPassword(password);
		
		try {
			conn = dataSource.getConnection();
			return conn;
		} catch (SQLServerException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void setPort(int port) {
		this.port = port;
	}
}
