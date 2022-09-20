package firstproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Datainsert {
	 
              public static void main(String gg[])
              {
            	  try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","root");
					String query = "insert into student values(?,?,?,?)";
					String name = "appu";
					int id = 104;
					int marks = 100;
					int mobile_no =743872;
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, name);
					pst.setInt(2,id);
					pst.setInt(3, marks);
					pst.setInt(4, mobile_no);
					
					System.out.println(pst);
					pst.execute();
					conn.close();
					System.out.println("data inserted successfully");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	  
            	  
              }
}
