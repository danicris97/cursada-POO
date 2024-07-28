package aplicaciones;

public class clsSession {
	
	protected int id;
	protected int roleID;
	protected String apenom;
	protected String descripcion;
	protected String dbName;
	
	public clsSession(int id, String apenom, int roleID, String descripcion, String dbName){
		setID(id);
		setApenom(apenom);
		setRoleID(roleID);
		setRol(descripcion);	
		setDBName(dbName);
	}

	public void setDBName(String dbName){
		this.dbName = dbName;
	}
	
	public String getDBName(){
		return this.dbName;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public int getID(){
		return this.id;
	}

	public void setRoleID(int roleID){
		this.roleID = roleID;
	}
	
	public int getRoleID(){
		return this.roleID;
	}
	
	
	public void setApenom(String apenom){
		this.apenom = apenom;
	}
	
	public String getApenom(){
		return this.apenom;
	}
	
	public void setRol(String descripcion){
		this.descripcion = descripcion;
	}
	
	private String getRol(){
		return this.descripcion;
	}
	
}
