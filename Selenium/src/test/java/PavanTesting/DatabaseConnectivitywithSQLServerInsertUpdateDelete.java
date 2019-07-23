package PavanTesting;

public class DatabaseConnectivitywithSQLServerInsertUpdateDelete {
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class dmlOperationsSQLServer {
	          public void sqltest() throws ClassNotFoundException, SQLException {
	  
	             //String insertquery = "INSERT INTO EMPLOYEE (EMPLOYEE_ID,Last_Name,FIRST_NAME)VALUES(2222,'SARAN','KUMAR')";
	             //String updatequery ="UPDATE EMPLOYEE SET FIRST_NAME='kumar' WHERE EMPLOYEE_ID=420";
	             //String deletequery ="DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID=2222";
	             
	             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	  
	                       
	             Connection conn =DriverManager.getConnection("jdbc:sqlserver://INVR28ILM6;port=1533;user=sa;password=Welcome1;database=HR;");
	    
	             Statement stmt = conn.createStatement();
	               
	     //stmt.executeQuery(insertquery);
	     //stmt.executeQuery(updatequery);
	     //stmt.executeQuery(deletequery);
	    
	     String query = "select FIRST_NAME,LAST_NAME from EMPLOYEE";
	    
	     ResultSet rs = stmt.executeQuery(query);
	        
	      while(rs.next())
	      {
	         String fName=rs.getString("FIRST_NAME");
	         String lName=rs.getString("LAST_NAME");
	         System.out.println(fName +"   "+ lName);
	         
	      }
	    
	                             
	  }
	     public static void main(String args[]) throws ClassNotFoundException, SQLException
	    
	     {
	             dmlOperationsSQLServer obj=new dmlOperationsSQLServer();
	            obj.sqltest();
	             
	   }
	    
	  }


}
