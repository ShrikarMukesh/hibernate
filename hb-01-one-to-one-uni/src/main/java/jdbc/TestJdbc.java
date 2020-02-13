package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			 myConn = DriverManager.getConnection(jdbcUrl, user, pass);
						
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}finally {
			if(myConn != null) {
				myConn.close();
			}else {
			   System.out.println("Connection is null");
			}
		}
		
	}

}



