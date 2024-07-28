package aplicaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


//https://www.javatpoint.com/java-sqlite
// https://www.sqlitetutorial.net/sqlite-java/update/

public class clsCRUDUsers {

	protected String url;
	protected Connection dbConn;
	protected String dbName;
	protected String dir = "/home/cristianm/Documentos/unsa/materias/workspace/POOSwing1/";

	protected PreparedStatement ps; 
	protected String SQL;
	protected ResultSet rs;

	public clsCRUDUsers(String dbName){
		
		this.dbName = dbName;
		this.url = "jdbc:sqlite:" + this.dir + this.dbName;		
		
	}
	
	
	 public ResultSet login(String email, String password){
		 this.rs=null;
		 
		 try {  
	            this. dbConn = DriverManager.getConnection(this.url);  
	            if (this.dbConn != null) {  
	          
	            	this.SQL ="SELECT users.id, users.email, users.apenom, users.fchalta, users.password, users.roleID, userRole.descripcion FROM users INNER JOIN userRole ON users.roleID=userRole.id WHERE users.email = ? AND users.password = ?";
	            	this.ps  = this.dbConn.prepareStatement(this.SQL);  
		            this.ps.setString(1, email);
		            this.ps.setString(2, password);
		            
	            	this.rs = this.ps.executeQuery();
		              
		            
	            }
	        } catch (SQLException e) {  
	            System.out.println(e.getErrorCode() + " " + e.getMessage());  
	        }	 
		 
		 return this.rs;
		 
	 }
	

	 public ResultSet getUsers(){
		 this.rs=null;
		 
		 try {  
	            this. dbConn = DriverManager.getConnection(this.url);  
	            if (this.dbConn != null) {  
	          
	            	this.SQL ="SELECT users.id, users.email, users.apenom, users.fchalta, users.password, users.roleID, userRole.descripcion FROM users INNER JOIN userRole ON users.roleID=userRole.id WHERE users.id > ?";
	            	this.ps  = this.dbConn.prepareStatement(this.SQL);  
	            	this.ps.setInt(1, 0);
	            	
	            	this.rs = this.ps.executeQuery();
		              
		            
	            }
	        } catch (SQLException e) {  
	            System.out.println(e.getErrorCode() + " " + e.getMessage());  
	        }	 
		 
		 return this.rs;
		 
	 }
	 

	 public int updateUser(String apenom, String password, int roleID, int id){
		 int result=0;
		 
		 try {  
	            this. dbConn = DriverManager.getConnection(this.url);  
	            if (this.dbConn != null) {  
	          
	            	this.SQL ="UPDATE users SET apenom=?, password=?, roleID=? WHERE id = ?";
	            	this.ps  = this.dbConn.prepareStatement(this.SQL);  
	            	this.ps.setString(1, apenom);
	            	this.ps.setString(2, password);
	            	this.ps.setInt(3, roleID);
	            	this.ps.setInt(4, id);
	            		            	
	            	result = this.ps.executeUpdate();             
		            
	            }
	        } catch (SQLException e) {  
	            System.out.println(e.getErrorCode() + " " + e.getMessage());  
	        }	 
		 
		 return result;
		 
	 }	

}
