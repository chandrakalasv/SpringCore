package com.example.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {
	private String driver;
	private String url;
	private String userName;
	private String password;
	Connection con;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/* @PostConstruct */
	public void init() throws ClassNotFoundException, SQLException {
		createConnection();
	}
	
	public  void createConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		con = DriverManager.getConnection(url, userName, password);
		
	}
	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from ESNew.HostelStudentInfo");
		while(rs.next()) {
			int student_id = rs.getInt(1);
			String student_name = rs.getString(2);
			double hostelFee = rs.getDouble(3);
			String foodType = rs.getString(4);
			System.out.println(student_id + " " + student_name + " " + hostelFee + " " + foodType + " ");
		}
		
	}
	
	public void deleteStudentRecord(int student_id) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		st.executeUpdate("delete from ESNew.HostelStudentInfo where student_id = " + student_id);
		System.out.println("student id " + student_id + "deleted"); 
		
	}
	
	/* @PreDestroy */
	public void destroy() throws SQLException {
		closeConnection();
	}
	
	public void closeConnection( ) throws SQLException {
		System.out.println("inside destroy method"); 
		con.close();
	}

}
