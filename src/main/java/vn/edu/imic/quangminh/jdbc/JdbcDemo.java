package vn.edu.imic.quangminh.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;


public class JdbcDemo {
	
	public static void main(String[] args) {
		//1. Tao DataSource object de quan ly config ket noi toi DB
		SQLServerDataSource dataSource = new SQLServerDataSource();
		dataSource.setServerName("192.168.0.5");
		dataSource.setDatabaseName("Y2016JC17");
		dataSource.setPortNumber(1433);
		dataSource.setUser("sa");
		dataSource.setPassword("123456");
		
		//2. Tao connection den database
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			if(!conn.isClosed()) {
				System.out.println("connected");
				
				//3. Insert Student by SQL query
				String sql = "INSERT INTO Student (fullName, dateOfBirth, address) "
						+ "VALUES (?, ?, ?)";
				//UPDATE Student Set fullName=? WHERE id = ?
				PreparedStatement preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setString(1, "Nguyen Van A");
				preparedStatement.setDate(2, new Date(new java.util.Date().getTime()));
				preparedStatement.setString(3, "Ha Noi");
				
				int executeUpdate = preparedStatement.executeUpdate();
				if(executeUpdate > 0) {
					System.out.println("Them sinh vien thanh cong");
				}
				
				//4. insert with store procedure
				CallableStatement callableStatement = conn.prepareCall("{ call INSERT_STUDENTS(?, ?, ?)}");
				callableStatement.setString(1, "Nguyen Van B");
				callableStatement.setDate(2, new Date(new java.util.Date().getTime()));
				callableStatement.setString(3, "Ha Tay");
				executeUpdate = callableStatement.executeUpdate();
				if(executeUpdate > 0) {
					System.out.println("Them sinh vien thanh cong");
				}
				
				//5. select all students
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM Student");
				while(resultSet.next()) {
					int id = resultSet.getInt("id");
					String fullName = resultSet.getString("fullName");
					Date dateOfBirth = resultSet.getDate("dateOfBirth");
					String address = resultSet.getString("address");
					
					System.out.println(String.format("id: %s, fullName: %s, DOB: %s,"
							+ " address: %s", 
							id, fullName, dateOfBirth, address));
				}
				
			} else {
				System.out.println("Not connected");
			}
			
		} catch (SQLServerException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
