package Ejercicio6;

public class ObraSocial {
	private int cuit;
	private String denominacion;
	private String domicilio;
	
	public ObraSocial(int cuit, String denominacion, String domicilio) {
		this.setCuit(cuit);
		this.setDenominacion(denominacion);
		this.setDomicilio(domicilio);
	}
	
	//SETTERS
	public void setCuit(int cuit) {this.cuit = cuit;}
	public void setDenominacion(String denominacion) {this.denominacion = denominacion;}
	public void setDomicilio(String domicilio) {this.domicilio = domicilio;}
	//GETTERS
	public int getCuit() {return this.cuit;}
	public String getDenominacion() {return this.denominacion;}
	public String getDomicilio() {return this.domicilio;}
	
}
