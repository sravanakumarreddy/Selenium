package PavanTesting;

public class DatabaseConnectivitywithOracle {
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class OracleConnection {
	           
	  public OracleConnection() throws ClassNotFoundException, SQLException {
	 
	             
	              Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ 143.54.6.0:1521:ORA11G","scott","tiger");    
	    
	      Statement stmt = connection.createStatement();
	     
	      String query = "select FIRST_NAME,LAST_NAME from EMPLOYEE";
	     
	      ResultSet rs = stmt.executeQuery(query);
	         
	       while(rs.next())
	       {
	          String fName=rs.getString("FIRST_NAME");
	          String lName=rs.getString("LAST_NAME");
	          System.out.println(fName +"   "+ lName);
	          
	         }
	      
	      
	     }
	     public static void main(String[] args) throws ClassNotFoundException, SQLException
	    
	     {
	     new OracleConnection();
	     }
	  }


}
