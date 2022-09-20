package firstproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dataselect {

	             public static void main(String args[])
	             {
	            	 try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","root");
						Statement stm = conn.createStatement();
						ResultSet rs = stm.executeQuery("select * from people");
						
						while(rs.next())
						{
							System.out.println(rs.getString(1)+","+rs.getInt(2)+","+rs.getString(3)+","+rs.getString(4));
						}
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	             }
}
