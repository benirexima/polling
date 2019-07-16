package polling;
import java.sql.*;

public class Connection {
	
	
		
		Connection(){
				
				connect();
			}
	
		java.sql.Connection con;
		Statement stmt;
			
		
		public void connect() {
			
			
				
					
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			System.out.println("data base connected");
					
			stmt= con.createStatement();
				   
		//**voter details will be insert
			
			String query = " insert into voter(voterid, name,sex,age,area)"
				    		+ " values(5001,'anu','female',22,'poonamalle')";
			         
				 stmt.execute(query);
				
				 String query1 = " insert into voter(voterid, name,sex,age,area)"
				    		+ " values(5002,'anish','male',23,'vadapalani')";
			         
				 stmt.execute(query1);
				 
				 String query2= " insert into voter(voterid, name,sex,age,area)"
				    		+ " values(5003,'remi','male',22,'guindy')";
			         
				 stmt.execute(query2);

				 
				 
				 //*candidate details will be insert
				 
				
		}
				    catch (Exception e)
				    {
				      System.err.println("login fail");
				      
				    }
		}
		public void addcan() {
			try
			{
			 String sql = " insert into candidate(id,password)"
			    		+ " values(10decoders,'abc12345)";
		         
			 stmt.execute(sql);
			 

			 String sql1 = " insert into candidate(id,password)"
			    		+ " values(10decoders,'def12345)";
		         
			 stmt.execute(sql1);}
			 catch (Exception e)
			    {
			      System.err.println("addcan ");
			      System.err.println(e.getMessage());
			    }
		}
		
		}
			
			
			
			
			

