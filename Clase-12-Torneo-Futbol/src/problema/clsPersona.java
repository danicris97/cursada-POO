package problema;

public class clsPersona {
	protected String apellido;
	protected String nombre;
	protected int dni;
	protected String celular;
	protected String mail;
	protected String direccion;
	
	clsPersona(String apellido, String nombre, int dni, String celular, String mail, String direccion){
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setDNI(dni);
		this.setCelular(celular);
		this.setMail(mail);
		this.setDireccion(direccion);
		
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public int getDNI(){
		return this.dni;
	}
	
	public void setDNI(int dni){
		this.dni = dni;
	}
	
	public String getCelular(){
		return this.celular;
	}
	
	public void setCelular(String celular){
		this.celular = celular;
	}	

	public String getDireccion(){
		return this.direccion;
	}
	
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}	

	public String getMail(){
		return this.mail;
	}
	
	public void setMail(String mail){
		this.mail = mail;
	}	

	
	
}
