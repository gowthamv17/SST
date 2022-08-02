package dbtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DB_Connection {
	static Connection con = null;
	@BeforeClass
	public static void DBConnection() {
		// TODO Auto-generated method stub

		try{
		 String dbUrl = "jdbc:postgresql://localhost:5432/dummyseleniumdb";					

			//Database Username		
			String username = "postgres";	
         
			//Database Password		
			String password = "Gautam@123";				

			con = DriverManager.getConnection(dbUrl, username, password);
	        if (con != null) {
	            System.out.println("Connected to database");
	        }
			}
	        catch (SQLException ex) {
	            ex.printStackTrace();
	            System.out.println(ex);
	        }
	}

		@AfterClass
		public static void Closeconnection() throws SQLException{
			con.close();
		}
	}


