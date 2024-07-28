package problema;

public class clsJugador extends clsPersona{
	protected String posicion;
	protected boolean esTitular;
	
	clsJugador(String apellido, String nombre, int dni, String celular, String mail, String direccion, String posicion, boolean esTitular){		
		super(apellido, nombre, dni, celular, mail, direccion);
		
		this.setEstitular(esTitular);
		this.setPosicion(posicion);
	}
	
	public String getPosicion(){
		return this.posicion;
	}
	
	public void setPosicion(String posicion){
		this.posicion = posicion;
	}
	
	public boolean getEstitular(){
		return this.esTitular;
	}
	
	public void setEstitular(boolean esTitular){
		this.esTitular = esTitular;
	}
	
}
