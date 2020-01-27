package windows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class database 
{
Connection con= null;


public Connection getconnection()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
	    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Kathmandu","root","");
	    
	} 
	catch (SQLException e) 
	{				
		System.out.println(e.getMessage());	
	}
	catch (ClassNotFoundException e) 
	    {
			
		System.out.println("driver not available");	
		}
	return con;
	
}
}
