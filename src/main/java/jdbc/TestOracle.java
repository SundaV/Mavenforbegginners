package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class TestOracle {
public static void main(String[] args) {
	Connection con;
	
	try {
		
		
	//	DriverManager.registerDriver(new OracleDriver());
		// Establish a connection
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.68.193.34:1521: localoesqara",
					"dnbtest1", "dnbtest1");
		
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from BANK");  
		while(rs.next()){
			System.out.println(rs.getInt(1));
		}
   
		con.close();

		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
