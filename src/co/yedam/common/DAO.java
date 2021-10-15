package co.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	protected Connection conn;
	protected Statement stmt;
	protected ResultSet rs;
	protected PreparedStatement psmt;
	
	protected String user = "hr";
	protected String pass = "hr";
	protected String url ="jdbc:oracle:thin:@localhost:1521:xe";
	
	protected void connect() {
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr", "hr");
				System.out.println("연결성공.");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
			
	//연결해제.
	protected void disconnect() {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
	
	}
			
}
