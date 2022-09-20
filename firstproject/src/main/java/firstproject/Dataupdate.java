package firstproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dataupdate {

	public static void main(String[] args) {
		
		     try {
				Class.forName("com.mysql.jdbc.Driver");
				 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","root");
				 String query = "Update student set marks=45 where Id=102";
				 PreparedStatement pst = conn.prepareStatement(query);
				 
				 System.out.println(pst);
					pst.execute();
					
					System.out.println("data updated successfully");
					
					String str = "delete from student where Id=104";
					PreparedStatement pst1 = conn.prepareStatement(str);
					 
					 System.out.println(pst1);
						pst1.execute();
						
						System.out.println("data deleted successfully");
					conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		     

	}

}
