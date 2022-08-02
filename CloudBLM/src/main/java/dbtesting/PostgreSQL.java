package dbtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQL extends DB_Connection{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			//Query to Execute		
			String query = "SELECT *FROM department";
         
  	    //Load postgreSQL jdbc driver		
    	    Class.forName("org.postgresql.Driver");			
    
    		//Create Connection to DB		
     	//Connection con = DriverManager.getConnection(dbUrl,username,password);
   
     	//Create Statement Object		
 	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
  		ResultSet rs= stmt.executeQuery(query);							
  
  		//System.out.println("result set");
  		// While Loop to iterate through all data and print results	
  		
  		if (rs.next() == false) {
  	        System.out.println("ResultSet in empty in Java");
  	      } else {

  	        do {
  	        	String userID = rs.getString(1);
        		String FirstName = rs.getString(2);
        		String empID = rs.getString(3);
            // String myAge = rs.getString(2);					                               
             System. out.println(userID + " " +FirstName+" "+empID);	
  	        } while (rs.next());
  	      }
//			while (rs.next()){
//		        		String userID = rs.getString(1);
//		        		String FirstName = rs.getString(2);
//                    // String myAge = rs.getString(2);					                               
//                     System. out.println(userID + " " +FirstName);		
//             }		
			 // closing DB Connection		
			con.close();			
	}

}
