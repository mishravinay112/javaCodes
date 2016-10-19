package collage;

import java.sql.*;

public class JDBCDemo 
{
	public static void main(String args[]) 
	{
		try 
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:Database1");
			Statement st = con.createStatement();
			String s = "select * from it";
			ResultSet rs = st.executeQuery(s);
			while (rs.next()) 
			{
				System.out.print("\n" + rs.getString(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.print("\t" + rs.getString(4));
			}

		} 
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		System.out.println("connection established");
	}
}
