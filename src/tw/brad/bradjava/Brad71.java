package tw.brad.bradjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Brad71 {

	public static void main(String[] args) {
		// 1. Load Driver (?)
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load OK");
		} catch (ClassNotFoundException e) {
			// Not Found Driver
			System.out.println("Driver Not Found");
		}
		
		// 2. Create Connection
		try {
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:mysql://localhost/iii?" +
                            "user=root&password=root");
			// 3. SQL => Statement Object
			Statement stmt = conn.createStatement();
			
			// 4. extect Statement
			stmt.executeUpdate("INSERT INTO cust (cname,tel,birthday)" + 
					" VALUES ('Brad','123','1999-01-02')");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM cust");
			while (rs.next()){
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				String tel = rs.getString("tel");
				String birthday = rs.getString("birthday");
				
				System.out.println(id + ":" + cname + ":" + tel + 
								":" + birthday);
				
			}
			
			
			
			conn.close();
			System.out.println("OK");
			
		} catch (SQLException e) {
			System.out.println("SQL ERROR");
		}
		
		
		
	}

}
