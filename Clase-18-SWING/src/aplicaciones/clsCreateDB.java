package aplicaciones;

import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DatabaseMetaData;  
import java.sql.DriverManager;  
import java.sql.SQLException;  

import java.sql.PreparedStatement;  

// https://www.javatpoint.com/java-sqlite
// https://www.caretit.com/blog/odoo-mobile-dev-3/post/how-insert-datetime-value-in-sqlite-database-36
// https://stackoverflow.com/questions/4355046/java-insert-multiple-rows-into-mysql-with-preparedstatement   

public class clsCreateDB {	
	protected String url;
	protected Connection dbConn;
	protected String dbName;
	protected String dir = "BD";
	
	protected Statement stmt;
	protected PreparedStatement preStmt;
	
	protected String SQL; // lo usare para crear tablas
	protected String filas[][];
	protected String tipos[];
	
	
	public clsCreateDB(String dbName){
		this.dbName = dbName;
		this.url = "jdbc:sqlite:" + this.dir + this.dbName;
		
		this.createNewDatabase();
		
		this.SQL ="CREATE TABLE IF NOT EXISTS users (\n"  
                + " id integer PRIMARY KEY AUTOINCREMENT,\n"  
                + " email text NOT NULL UNIQUE,\n"  
                + " apenom text NOT NULL,\n"
                + " fchalta DATETIME DEFAULT CURRENT_TIMESTAMP,\n"
                + " password text NOT NULL,\n"
                + " roleID integer NOT NULL \n"
                + ");"; 
		
		this.createNewTable("users");
		
		this.SQL = "insert into users (email, apenom, password, roleID) values (?, ?, ?, ?)";
		
		this.filas = new String[][]{
    		    {"martinezdro1@gmail.com", "Cristian Martinez", "cristian1234", "1"},
    		    {"saramayo@gmail.com", "Sergio Aramayo", "sergio1234", "2"},
    		    {"darsalta@gmail.com", "Diego Rodriguez", "diego1234", "2"}
    		};
		
		this.tipos = new String[]{"String", "String", "String", "int"};		
		
		this.insertFirstRecords();
		

		// voy por la 2da tabla

		this.SQL ="CREATE TABLE IF NOT EXISTS userRole (\n"  
                + " id integer PRIMARY KEY AUTOINCREMENT,\n"  
                + " descripcion text NOT NULL UNIQUE,\n"  
                + " fchalta DATETIME DEFAULT CURRENT_TIMESTAMP \n"
                + ");";	
		
		this.createNewTable("userRole");
		
		this.SQL ="insert into userRole (descripcion) values (?)";
				
		this.filas = new String[][]{
    		    {"administrador"},
    		    {"operador"}
    		};
		
		this.tipos = new String[]{"String"};		
		
		this.insertFirstRecords();	
				
	}
  
    public void createNewDatabase() {         
   
        try {  
            this. dbConn = DriverManager.getConnection(this.url);  
            if (this.dbConn != null) {  
                DatabaseMetaData meta = this. dbConn.getMetaData();  
                System.out.println("El driver es " + meta.getDriverName());  
                System.out.println("Exito. Se creo la DB " + this.dbName);
                
                this.dbConn.close();
            }  
   
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    
    
    public void createNewTable(String tableName){
    	this.stmt = null;
    	
         try{  
        	 this.dbConn = DriverManager.getConnection(this.url);
        	 
        	 if (this.dbConn != null) {
        		 this.stmt = this.dbConn.createStatement();  
                 this.stmt.execute(this.SQL);
                 
                 System.out.println("Exito. Se creo la tabla " + tableName);
                 
                 this.dbConn.close();
        	 }    	 
               
         
         } catch (SQLException e) {  
             System.out.println(e.getMessage());  
         }
    	 
    }
    

    
    public void insertFirstRecords(){
    	int roleID;
    	int numRowsInserted;
    	int cantCols;
    	String cadena;
    	
    	cantCols = this.filas[0].length;
    	
    	//System.out.println("cols "+ cantCols + " " + this.SQL);
    	
    	StringBuffer mySQL = new StringBuffer(this.SQL);
    	for (int i = 0; i < this.filas.length - 1; i++) {
    		 
    		 cadena = ",(";
    		 for (int j=0; j<cantCols; j++){
    			 cadena = cadena + "?,";
    		 }
    		 
    		 cadena = cadena.substring(0,cadena.length()-1); // quito ultima ,
    		 cadena = cadena + ")";
    		 
    		 mySQL.append(cadena);
    		 
    	}
    	mySQL.append(";"); //also add the terminator at the end of sql statement    	
	
    	
        try{  
       	 this.dbConn = DriverManager.getConnection(this.url);
       	 
	       	 if (this.dbConn != null) {
	       		this.preStmt = this.dbConn.prepareStatement(mySQL.toString());
	       		 
	         	for (int i = 0; i < this.filas.length; i++) {
	         		
	         		for (int j=0; j<cantCols; j++){
	         			if (this.tipos[j].equals("String")){
	         				this.preStmt.setString((cantCols * i) + j + 1, this.filas[i][j]);
		         		}
	         			
	         			if (this.tipos[j].equals("int")){
	         				roleID = Integer.parseInt(filas[i][j]); 	         		
	    	         		this.preStmt.setInt((cantCols * i) + j+ 1, roleID); // rol 		
	    	         		
		         		}	         			
	         		}        		
	         		
	         	}

	         	numRowsInserted = this.preStmt.executeUpdate(); // inserto varias filas      		 
	            	                
	            System.out.println("Exito. Se insertaron " + numRowsInserted + " fila/s");	                
	            this.dbConn.close();
	       	 }             
        
        } catch (SQLException e) {  
            System.out.println("Error " + e.getErrorCode() + " " +  e.getMessage());  
            e.printStackTrace();
        }    	    	
    }  
      
      
}  