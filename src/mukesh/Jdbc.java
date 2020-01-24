package mukesh;


import java.sql.*;

public class Jdbc {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Kathmandu","root","");
		    String sql="select * from student";
		    PreparedStatement stmt= con.prepareStatement(sql);
		    ResultSet rs=   stmt.executeQuery();
		    while(rs.next())
		    {
		    	System.out.println("studentid: "+rs.getInt("studentid")+"  studentname: "+rs.getString("studentname")+
		    			"  roll: "+rs.getString("roll")+
		    			"  address: "+rs.getString("address"));
		    }
		
		} 
		catch (SQLException e) 
		{				
			System.out.println(e.getMessage());	
		}
		catch (ClassNotFoundException e) 
		    {
				
			System.out.println("driver not available");	
			}

}

}
