package vn.edu.imic.nguyenhonghieu.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import sun.applet.Main;
import sun.awt.SunHints.Value;

public class JDBCStudents {
	Connection connection;
	Statement st;
	
	int phonenumber;
	String id,fullname,address,email,gender,courseld;
	Date date = new Date(new java.util.Date().getTime());
	public JDBCStudents(){
		try{
			SQLServerDataSource dataSource = new SQLServerDataSource();
			dataSource.setServerName("HIEU-PC");
			dataSource.setDatabaseName("imic2016jc17");
			dataSource.setPortNumber(1433);
			dataSource.setUser("sa");
			dataSource.setPassword("123456");
		}catch(Exception e){
		}
	}
	
	public void addStudents(){
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("ID: ");
			id = scanner.nextLine();
			System.out.println("Name: ");
			fullname = scanner.nextLine();
			//chua in date
			System.out.println("Address: ");
			address = scanner.nextLine();
			System.out.println("Email: ");
			email = scanner.nextLine();
			System.out.println("Gender: ");
			gender = scanner.nextLine();
			System.out.println("Phone: ");
			phonenumber = scanner.nextInt();
			System.out.println("Courseld: ");
			courseld = scanner.nextLine();
			String sql = "insert into stundents(id,fullname,dateofbirth,address,email,gender,phonenumber,courseld)"+"values(?,?,?,?,?,?,?,?)";
			System.out.println(String.format("Thong tin: id:%s, fullname:%s, date:%s, address:%s, email:%s, gender:%s, phone:%s, courseld:%s"
					,id,fullname,date,address,email,gender,phonenumber,courseld ));
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			if(connection != null){
				try{
					st.close();
					connection.close();
				}catch(Exception e){
					
				}
			}
		}
	}
	
	public void getStudents(){
		try{
			String sql = "select*from students";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				 id = rs.getString("id");
				 fullname = rs.getString("fullname");
				 date = rs.getDate("dateofbirth");
				 address = rs.getString("address");
				 email = rs.getString("email");
				 gender = rs.getString("gender");
				 phonenumber = rs.getInt("phonenumber");
				 courseld = rs.getString("courseld");
			}
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			if(connection != null){
				try{
					st.close();
					connection.close();
				}catch(Exception e){
					
				}
			}
		}
	}
	public static void main(String[] args) {
		
	}
}

